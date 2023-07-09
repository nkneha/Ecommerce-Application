package com.example.EcommerceAPI.service;

import com.example.EcommerceAPI.model.Address;
import com.example.EcommerceAPI.repository.IAddressRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class AddressService {
    @Autowired
    IAddressRepo iAddressRepo;

    public String createAddress(Address address) {
        iAddressRepo.save(address);
        return "Address added";
    }

    public Iterable<Address> getAllAddress() {
        return iAddressRepo.findAll();
    }

    public Address getAddressbyid(Integer addId) {
        Optional<Address> optional= iAddressRepo.findById(addId);

        if(optional.isPresent()){
            return optional.get();
        }
        return null;
    }
}
