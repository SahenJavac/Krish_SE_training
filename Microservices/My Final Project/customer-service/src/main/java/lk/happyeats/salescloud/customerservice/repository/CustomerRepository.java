package lk.happyeats.salescloud.customerservice.repository;

import lk.happyeats.salescloud.model.customer.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer,Integer> {
}
