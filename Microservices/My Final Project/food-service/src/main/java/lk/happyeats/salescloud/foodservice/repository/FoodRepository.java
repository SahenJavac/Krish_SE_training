package lk.happyeats.salescloud.foodservice.repository;

import lk.happyeats.salescloud.model.food.Food;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FoodRepository extends JpaRepository<Food,Integer> {
}
