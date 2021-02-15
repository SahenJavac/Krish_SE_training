package lk.happyeats.salescloud.salesservice.hystrix;

import com.netflix.hystrix.HystrixCommand;
import com.netflix.hystrix.HystrixCommandGroupKey;
import lk.happyeats.salescloud.model.food.Food;
import org.springframework.web.client.RestTemplate;

public class FoodCommand extends HystrixCommand<Food> {

    RestTemplate restTemplate;
    int foodId;

    public FoodCommand(RestTemplate restTemplate, int foodId) {
        super(HystrixCommandGroupKey.Factory.asKey("default"));
        this.restTemplate = restTemplate;
        this.foodId = foodId;
    }

    @Override
    protected Food run() throws Exception {
        return restTemplate.getForObject("http://food/services/foods/"+foodId,Food.class);
    }

    @Override
    protected Food getFallback() {
        return new Food();
    }
}
