package com.example.EcommerceAPI.service;

import com.example.EcommerceAPI.model.Product;
import com.example.EcommerceAPI.repository.IProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {
    @Autowired
    IProductRepo iProductRepo;

    public String createProduct(Product product) {
        iProductRepo.save(product);
        return "product created";
    }

    public Iterable<Product> getAllProduct() {
        return iProductRepo.findAll();
    }

    public String DeleteProduct(Integer productId) {
        if (iProductRepo.existsById(productId)) {
            iProductRepo.deleteById(productId);
            return "product deleted";
        } else {
            return "productId does not exist";
        }
    }
}
