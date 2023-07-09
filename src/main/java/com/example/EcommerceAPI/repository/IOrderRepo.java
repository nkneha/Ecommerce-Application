package com.example.EcommerceAPI.repository;

import com.example.EcommerceAPI.model.Order;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IOrderRepo extends CrudRepository<Order,Integer> {
}
