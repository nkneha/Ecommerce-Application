package com.example.EcommerceAPI.controller;

import com.example.EcommerceAPI.model.Order;
import com.example.EcommerceAPI.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class OrderController {
    @Autowired
    OrderService orderService;

    @PostMapping("order")
    public String createOrder(@RequestBody Order order){
        return orderService.createOrder(order);

    }
    @GetMapping("order")
    public Iterable<Order> getAllOrder(){
        return orderService.getAllOrder();
    }
    @GetMapping("order/id/{id}")
    public Order getOrderById(@PathVariable Integer id){
        return orderService.getOrderById(id);
    }

}
