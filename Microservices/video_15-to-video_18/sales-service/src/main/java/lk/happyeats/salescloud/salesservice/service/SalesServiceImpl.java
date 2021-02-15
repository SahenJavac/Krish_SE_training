package lk.happyeats.salescloud.salesservice.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import lk.happyeats.salescloud.model.customer.Customer;
import lk.happyeats.salescloud.model.food.Food;
import lk.happyeats.salescloud.model.sales.Sales;
import lk.happyeats.salescloud.salesservice.model.DetailResponse;
import lk.happyeats.salescloud.salesservice.repository.SalesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;
import java.util.Optional;

@Service
public class SalesServiceImpl implements SalesService {

    @Autowired
    SalesRepository salesRepository;

    @LoadBalanced
    @Bean
    RestTemplate getRestTemplate(RestTemplateBuilder builder) {
        return builder.build();
    }

    @Autowired
    RestTemplate restTemplate;

    @Override
    public Sales save(Sales customer) {
        return salesRepository.save(customer);
    }

    @Override
    public Sales findById(int id) {
        Optional<Sales> sales = salesRepository.findById(id);

        if (sales.isPresent())
            return sales.get();
        else
            return new Sales();

    }

    @Override
    public List<Sales> findAll() {
        return salesRepository.findAll();
    }

    @Override
    @HystrixCommand(fallbackMethod = "findDetailsResponseFallBack")
    public DetailResponse findDetailResponse(int id) {
        Sales sales = findById(id);
        //Customer customer = getCustomer(sales.getCustomerId());
        Customer customer=restTemplate.getForObject("http://customer/services/customers/"+id,Customer.class);
        Food food = getFood(sales.getFoodId());

        return new DetailResponse(sales, customer, food);
    }

    public DetailResponse findDetailsResponseFallBack(int id) {
        return new DetailResponse(new Sales(), new Customer(), new Food());

    }

    private Customer getCustomer(int customerId){

        Customer customer=restTemplate.getForObject("http://customer/services/customers/"+customerId,Customer.class);
        return customer;

    }

    private Food getFood(int foodId){

        return restTemplate.getForObject("http://food/services/foods/"+foodId,Food.class);


    }
}
