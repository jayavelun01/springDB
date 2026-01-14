package com.productDB.demo.service;

import com.productDB.demo.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.productDB.demo.repository.ProductRepo;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    ProductRepo repo;

    //Get Product Details
    public List<Product> getProducts() {
        return repo.findAll();
    }

    //Get the Product by Id
    public Product getProductId(@PathVariable int prodId) {
        return repo.findById(prodId).orElse(new Product());
    }

    //Add product
    public void addProduct(@RequestBody Product prod) {
        repo.save(prod);
    }

    //Update product
    public void updateProduct(@RequestBody Product prod) {
        repo.save(prod);
    }

    //Delete product
    public void deleteProduct(@PathVariable int prodId) {
        repo.deleteById(prodId);
    }
}
