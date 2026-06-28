package com.productDB.demo.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "product")
public class Product {

    @Id
    //Object to Table matching
//    @Column(name = "prod_id")
    private int prodId;

//    @Column(name = "prod_name")
    private String prodName;

//    @Column(name = "price")
    private BigDecimal price;

    private String description;
}
