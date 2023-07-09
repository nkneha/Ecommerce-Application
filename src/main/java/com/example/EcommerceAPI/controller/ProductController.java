package com.example.EcommerceAPI.controller;

import com.example.EcommerceAPI.model.Product;
import com.example.EcommerceAPI.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class ProductController {
    @Autowired
    ProductService productService;

    @PostMapping("product")
    public String createProduct(@RequestBody Product product){
        return productService.createProduct(product);
    }
    @GetMapping("product")
    public Iterable<Product> getAllProduct(){
        return productService.getAllProduct();
    }
    @DeleteMapping("product")

    public String DeleteProduct(@RequestParam("id") Integer productId)
    {
        return productService.DeleteProduct(productId);
    }
}
