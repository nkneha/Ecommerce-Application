package com.example.EcommerceAPI.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Order {

//    userID:integer (foreign key mapping)
//    productID:integer(foreign key mapping)
//    addressID:integer(foreign key mapping)
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer orderId;
    private Integer prodQuantity;


    //mappings
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="fk_user_id")
    private User user;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "fk_order_product_table",joinColumns =@JoinColumn(name="fk_order_id"),inverseJoinColumns = @JoinColumn(name ="fk_product_id"))
    private List<Product> product;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "fk_add_id")
    private Address address;
}
