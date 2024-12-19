package com.lightcodese.dsa.controller;

import com.lightcodese.dsa.entity.ProductEntity;
import com.lightcodese.dsa.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/v1/api/products")
// localhost:8002/v1/api
public class ProductController {
    @Autowired
    private ProductService productService;

    @PostMapping("/")
    public ProductEntity createProduct(ProductEntity product) {
        return productService.createProduct(product);
    }

    /**
     * List All
     * @return List
     */
    @GetMapping("/")
    public List<ProductEntity> getAllProducts() {
        return productService.getAllProducts();
    }
}
