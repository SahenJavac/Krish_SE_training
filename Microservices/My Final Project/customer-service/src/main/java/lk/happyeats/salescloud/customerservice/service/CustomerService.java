package lk.happyeats.salescloud.customerservice.service;

import lk.happyeats.salescloud.model.customer.Customer;

import java.util.List;

public interface CustomerService {
    Customer save(Customer customer);

    Customer findById(int id);

    List<Customer> findAll();
}
