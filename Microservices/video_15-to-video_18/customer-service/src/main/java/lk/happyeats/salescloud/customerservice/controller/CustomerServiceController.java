package lk.happyeats.salescloud.customerservice.controller;

import lk.happyeats.salescloud.customerservice.service.CustomerService;
import lk.happyeats.salescloud.model.customer.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;

@RestController
@RequestMapping(value = "/services/customers")
public class CustomerServiceController{



    @Autowired
    CustomerService customerService;

    @PostMapping
    public Customer save(@RequestBody Customer customer) {
        return customerService.save(customer);
    }

    @GetMapping(value = "/{id}")
    public Customer getCustomer(@PathVariable int id) {

       // System.out.println("request came on "+ LocalDateTime.now() + " mmmmmmmm");
        return customerService.findById(id);
    }

    @GetMapping
    public List<Customer> getAllCustomers() {
        return customerService.findAll();
    }




}