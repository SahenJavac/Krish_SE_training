package lk.happyeats.salescloud.salesservice.repository;

import lk.happyeats.salescloud.model.sales.Sales;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SalesRepository extends JpaRepository<Sales,Integer> {
}
