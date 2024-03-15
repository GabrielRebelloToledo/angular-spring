package com.gabriel.crudspring.controller;

import org.springframework.web.bind.annotation.RestController;

import com.gabriel.crudspring.model.Products;

import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;



@RestController
@RequestMapping("/api/products")
public class ProductController {

    @GetMapping
    public List<Products> list(){
        return null;
    }
    
}
