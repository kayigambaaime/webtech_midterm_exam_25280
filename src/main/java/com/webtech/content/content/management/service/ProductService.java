package com.webtech.content.content.management.service;


import com.webtech.content.content.management.model.Product;
import com.webtech.content.content.management.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    private final ProductRepository productRepository;

    @Autowired
    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    // Create or Update a Product
    public Product saveProduct(Product product) {
        return productRepository.save(product);
    }

    // Retrieve all Products
    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    // Retrieve Product by ID
    public Product getProductById(Long id) {
        return productRepository.findById(id).orElse(null);
    }

    // Search Products by Name Containing a String
    public List<Product> searchProductsByName(String name) {
        return productRepository.findByNameContaining(name);
    }

    // Delete a Product by ID
    public void deleteProductById(Long id) {
        productRepository.deleteById(id);
    }
}
