package com.lightcodese.dsa.service;

import com.lightcodese.dsa.entity.ProductEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ProductService {
    ProductEntity createProduct(ProductEntity product);
    List<ProductEntity> getAllProducts();
}