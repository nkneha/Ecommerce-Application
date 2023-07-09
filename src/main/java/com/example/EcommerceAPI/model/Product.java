package com.example.EcommerceAPI.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer prodId;
    @NotBlank(message = "name cannot be blank")
    private String prodName;
    @NotBlank(message = "Price cannot be blank")
    private Integer prodPrice;
    @NotBlank(message = "Description cannot be blank")
    private String prodDescription;
    @Enumerated(EnumType.STRING)
    private Category category;
    private String prodBrand;

}
