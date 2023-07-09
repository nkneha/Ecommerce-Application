package com.example.EcommerceAPI.service;

import com.example.EcommerceAPI.model.Order;
import com.example.EcommerceAPI.repository.IOrderRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class OrderService {
    @Autowired
    IOrderRepo iOrderRepo;

    public String createOrder(Order order) {
         iOrderRepo.save(order);
         return "order created";
    }

    public Iterable<Order> getAllOrder() {
        return iOrderRepo.findAll();
    }

    public Order getOrderById(Integer id) {
        Optional<Order> optional= iOrderRepo.findById(id);
        if(optional.isPresent()){
            return optional.get();
        }
        return null;
    }
}
