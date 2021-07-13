package com.example.demo.service;

import com.example.demo.model.Order;
import com.example.demo.repository.OrderRepository;

import java.util.List;

public interface OrderService{
    Order create (Order order);
    Order update (Order order);
    void delete (Long id);
    List<Order> getMyOrders (Long id);
}
