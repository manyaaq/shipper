package com.example.demo.service;

import com.example.demo.model.Order;
import com.example.demo.repository.OrderRepository;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OrderServiceImpl implements OrderService {
    OrderRepository orderRepository;
    @Override
    public Order create(Order order) {
     return   orderRepository.save(order);
    }

    @Override
    public Order update(Order order) {
       return orderRepository.save(order);
    }

    @Override
    public void delete(Long id) {
        orderRepository.deleteById(id);
    }


    @Override
    public List<Order> getMyOrders(Long id) {
        return  orderRepository.findAll();
    }

}
