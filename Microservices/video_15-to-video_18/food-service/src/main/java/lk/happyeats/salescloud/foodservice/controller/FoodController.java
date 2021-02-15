package lk.happyeats.salescloud.foodservice.controller;

import lk.happyeats.salescloud.foodservice.service.FoodService;
import lk.happyeats.salescloud.model.food.Food;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;

@RestController
@RequestMapping("/services/foods")
public class FoodController {

    @Autowired
    FoodService foodService;

    @PostMapping
    public Food save(@RequestBody Food food) {

        return foodService.save(food);
    }

    @GetMapping(value = "/{id}")
    public Food getFood(@PathVariable int id)
    {
        System.out.println("request came on "+ LocalDateTime.now() + "  ++++++++++++++++++++++");
        return foodService.findById(id);
    }

    @GetMapping
    public List<Food> getAllVehicles() {
        return foodService.findAll();
    }

}
