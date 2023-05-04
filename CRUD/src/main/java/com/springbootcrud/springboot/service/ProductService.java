package com.springbootcrud.springboot.service;

import com.springbootcrud.springboot.entity.Product;

import java.util.List;
import java.util.Optional;

public interface ProductService {

    public List<Product> findAll();

    public Optional<Product> findById(Long id);

    public List<Product> findByName(String name);

    public void createProduct(Product product);

    public void modifyProduct(Long id, Product product);

    public void deleteProduct(Long id);

}
