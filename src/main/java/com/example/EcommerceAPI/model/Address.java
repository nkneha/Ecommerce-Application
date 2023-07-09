package com.example.EcommerceAPI.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Address {

    //UserID : foreign key mapping
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer addId;
    private String addName;
    private String addLandmark;
    private String addPhoneNum;
    private String addZip;
    private String addState;

    //mapping
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "fk_address_id")
    private User user;


}
