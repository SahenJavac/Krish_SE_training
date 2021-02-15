package com.sahen.rentcloud.commons.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "food")
public class Food {

    @Id
    @GeneratedValue
    int id;

    String type;
    String size;



    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String make) {
        this.type = make;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String model) {
        this.size = model;
    }

}
