package lk.happyeats.salescloud.salesservice.model;

import lk.happyeats.salescloud.model.sales.Sales;

public class SimpleResponse {

    Sales sales;

    public SimpleResponse(Sales sales) {
        this.sales = sales;
    }
    public Sales getSales(){
        return sales;
    }

    public void setSales(Sales sales) {
        this.sales = sales;
    }
}
