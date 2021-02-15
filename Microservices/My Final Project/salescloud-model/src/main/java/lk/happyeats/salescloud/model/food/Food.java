package lk.happyeats.salescloud.model.food;



import javax.persistence.*;

@Entity
@Table(name = "food")

public class Food {
    @Id
    @GeneratedValue//(strategy = GenerationType.IDENTITY)
    int id;

    String name;
    String type;
    String size;
    int price;

    String extraAddOns;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getExtraAddOns() {
        return extraAddOns;
    }

    public void setExtraAddOns(String extraAddOns) {
        this.extraAddOns = extraAddOns;
    }
}
