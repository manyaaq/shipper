package com.example.demo.controller;

import com.example.demo.model.Order;
import com.example.demo.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.annotation.Secured;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/order")
@CrossOrigin("*")
public class OrderController {
    @Autowired
    OrderService orderService;

    @PostMapping("/create")
    public Order create (@RequestBody Order order){
        return orderService.create(order);
    }
    @PostMapping("/update")
    public Order update (@RequestBody Order order){
        return orderService.update(order);
    }
    @Secured("ROLE_ADMIN")
    @DeleteMapping("/delete/{id}")
    public void deleteByID (@PathVariable Long id){
        orderService.delete(id);
    }
    @GetMapping("/getMyOrders")
    public List<Order> getMyOrders(@PathVariable Long id ){
        return  orderService.getMyOrders(id);
    }


}
