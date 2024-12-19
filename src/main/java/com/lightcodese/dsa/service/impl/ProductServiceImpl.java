package com.lightcodese.dsa.service.impl;

import com.lightcodese.dsa.entity.ProductEntity;
import com.lightcodese.dsa.repository.ProductRepository;
import com.lightcodese.dsa.service.ProductService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {
    private ProductRepository productRepository;

    @Override
    public ProductEntity createProduct(ProductEntity product) {
        return productRepository.createProduct(product);
    }

    @Override
    public List<ProductEntity> getAllProducts() {
        return productRepository.getAllProducts();
    }
}
