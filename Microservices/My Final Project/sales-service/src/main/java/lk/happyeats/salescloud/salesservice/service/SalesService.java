package lk.happyeats.salescloud.salesservice.service;

import lk.happyeats.salescloud.model.sales.Sales;
import lk.happyeats.salescloud.salesservice.model.DetailResponse;

import java.util.List;

public interface SalesService {
    Sales save(Sales customer);

    Sales findById(int id);

    List<Sales> findAll();

    DetailResponse findDetailResponse(int id);
}
