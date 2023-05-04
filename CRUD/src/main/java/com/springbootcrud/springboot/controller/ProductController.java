package com.springbootcrud.springboot.controller;

import com.springbootcrud.springboot.entity.Product;
import com.springbootcrud.springboot.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/product")
public class ProductController {

    @Autowired
    ProductService productService;

    @GetMapping
    public List<Product> listProduct(){
        return productService.findAll();
    }

    @GetMapping(value = "/{id}")
    public Optional<Product> obtenerProduct(@RequestParam Long id){
        return productService.findById(id);
        //return productService.findById(id);
    }

    @PostMapping()
    public void createProduct(@RequestBody Product product){
        productService.createProduct(product);
    }

    @GetMapping(value = "/{name}")
    public List<Product> nameProduct(@RequestParam String name){
        return productService.findByName(name);
    }

    @PutMapping(value="/{id}")
    public void modifyProduct(@PathVariable Long id, @RequestBody Product product){
        productService.modifyProduct(id, product);
    }

    @DeleteMapping(value="/{id}")
    public void deleteProduct(@PathVariable Long id){
        productService.deleteProduct(id);
    }
}
