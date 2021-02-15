package lk.happyeats.salescloud.foodservice.service;

import lk.happyeats.salescloud.foodservice.repository.FoodRepository;
import lk.happyeats.salescloud.model.food.Food;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FoodServiceImpl implements FoodService {
    @Autowired
    FoodRepository foodRepository;


    @Override
    public Food save(Food food) {
        return foodRepository.save(food);
    }

    @Override
    public Food findById(int id) {
        Optional<Food> food = foodRepository.findById(id);

        if (food.isPresent()) {
            return food.get();
        }else {
            return new Food();
        }
    }

    @Override
    public List<Food> findAll() {
        return foodRepository.findAll();
    }
}
