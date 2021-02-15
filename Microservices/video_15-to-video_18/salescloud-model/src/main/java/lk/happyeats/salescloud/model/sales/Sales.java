package lk.happyeats.salescloud.model.sales;



import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "sales")

public class Sales {
    @Id
    @GeneratedValue//(strategy = GenerationType.IDENTITY)
    int salesId;
    int customerId;
    int foodId;
    LocalDateTime orderTime;
    int quantity;
    String deliveryLocation;

    public int getSalesId() {
        return salesId;
    }

    public void setSalesId(int salesId) {
        this.salesId = salesId;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public int getFoodId() {
        return foodId;
    }

    public void setFoodId(int foodId) {
        this.foodId = foodId;
    }

    public LocalDateTime getOrderTime() {
        return orderTime;
    }

    public void setOrderTime(LocalDateTime orderTime) {
        this.orderTime = orderTime;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getDeliveryLocation() {
        return deliveryLocation;
    }

    public void setDeliveryLocation(String deliveryLocation) {
        this.deliveryLocation = deliveryLocation;
    }
}
