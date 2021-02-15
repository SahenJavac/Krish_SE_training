package lk.happyeats.salescloud.foodservice.service;

import lk.happyeats.salescloud.model.food.Food;

import java.util.List;

public interface FoodService {

    Food save(Food food);

    Food findById(int id);

    List<Food> findAll();
}
