package com.springbootcrud.springboot.service;

import com.springbootcrud.springboot.dao.ProductDao;
import com.springbootcrud.springboot.entity.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductServiceImpl implements ProductService{

    @Autowired
    private ProductDao productDao;

    @Override
    public List<Product> findAll() {
        return (List<Product>)productDao.findAll();
    }

    @Override
    public Optional<Product> findById(Long id) {
        return productDao.findById(id);
        //return productDao.findById(id).orElse(null);
    }

    @Override
    public List<Product> findByName(String name) {
        return productDao.findByName(name);
    }


    @Override
    public void createProduct(Product product) {
        productDao.save(product);
    }

    @Override
    public void modifyProduct(Long id, Product product) {
        if(productDao.existsById(id)){
            product.setId(id);
            productDao.save(product);
        }
    }

    @Override
    public void deleteProduct(Long id) {
        if(productDao.existsById(id)){
            productDao.deleteById(id);
        }
    }
}
