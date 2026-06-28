package com.productDB.demo.controller;

import com.productDB.demo.model.Product;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.productDB.demo.service.ProductService;

import java.util.List;

@RestController
public class ProductController {

    @Autowired
    ProductService service;

    @GetMapping("/products")
    public List<Product> getProducts() {
        return service.getProducts();
    }

    @GetMapping("/product/{prodId}")
    public Product getProductId(@PathVariable int prodId) {
        return service.getProductId(prodId);
    }

    @PostMapping("/addProduct")
    public void addProduct(@RequestBody Product prod) {
        service.addProduct(prod);
    }

    @PutMapping("/updateProduct/{prodId}")
    public void updateProduct(@PathVariable int prodId, @RequestBody Product prod) {
        service.updateProducts(prodId, prod);
    }

    @DeleteMapping("/deleteProduct/{prodId}")
    public void deleteProduct(@PathVariable int prodId) {
        service.deleteProduct(prodId);
    }

    @PostConstruct
    public void init() {
        System.out.println("ProductController loaded");
    }

}
