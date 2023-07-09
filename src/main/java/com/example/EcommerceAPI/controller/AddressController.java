package com.example.EcommerceAPI.controller;

import com.example.EcommerceAPI.model.Address;
import com.example.EcommerceAPI.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class AddressController {

    @Autowired
    AddressService addressService;

    @PostMapping("address")
    public String createAddress(@RequestBody Address address){
        return addressService.createAddress(address);
    }
    @GetMapping("address")
    public Iterable<Address> getAllAddress() {
        return addressService.getAllAddress();
    }
    @GetMapping("addresswithid")
    public Address getAddressbyid(@RequestParam("id") Integer addId) {
        return addressService.getAddressbyid(addId);
    }
}
