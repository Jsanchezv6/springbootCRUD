package com.springbootcrud.springboot.dao;

import com.springbootcrud.springboot.entity.Product;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ProductDao extends CrudRepository <Product, Long> {
    List<Product> findByName(String name);
}
