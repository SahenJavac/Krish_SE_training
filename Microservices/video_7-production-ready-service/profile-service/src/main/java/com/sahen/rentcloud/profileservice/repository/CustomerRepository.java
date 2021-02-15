package com.sahen.rentcloud.profileservice.repository;


import com.sahen.rentcloud.commons.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository  extends JpaRepository<Customer,Integer> {
}
