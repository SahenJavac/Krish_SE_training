package lk.happyeats.salescloud.salesservice.model;

import lk.happyeats.salescloud.model.customer.Customer;
import lk.happyeats.salescloud.model.food.Food;
import lk.happyeats.salescloud.model.sales.Sales;

public class DetailResponse implements Response {
    Sales sales;
    Customer customer;
    Food food;

    public DetailResponse(Sales sales, Customer customer, Food food) {
        this.sales = sales;
        this.customer = customer;
        this.food = food;
    }

    public Sales getSales() {
        return sales;
    }

    public void setSales(Sales sales) {
        this.sales = sales;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Food getFood() {
        return food;
    }

    public void setFood(Food food) {
        this.food = food;
    }

}
