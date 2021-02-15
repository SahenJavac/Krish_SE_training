package lk.happyeats.salescloud.salesservice.controller;

import lk.happyeats.salescloud.model.sales.Sales;
import lk.happyeats.salescloud.salesservice.model.Response;
import lk.happyeats.salescloud.salesservice.model.SimpleResponse;
import lk.happyeats.salescloud.salesservice.service.SalesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/services/sales")
public class SalesController {

    @Autowired
    SalesService salesService;

    @PostMapping
    public Sales save(@RequestBody Sales sales){
        return  salesService.save(sales);
    }
    @GetMapping(value = "/{id}")
    public Response getSales(@PathVariable int id, @RequestParam(required = false) String type){
        if (type == null) {
            return (Response) new SimpleResponse(salesService.findById(id));
        }else {
            return salesService.findDetailResponse(id);
        }

    }
    @GetMapping
    public List<Sales> getAllSales(){
        return salesService.findAll();
    }

}
