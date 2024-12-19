package com.lightcodese.dsa.repository.impl;

import com.lightcodese.dsa.entity.ProductEntity;
import com.lightcodese.dsa.repository.ProductRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ProductRepositoryImpl implements ProductRepository {

    @Override
    public ProductEntity createProduct(ProductEntity product) {
        ProductEntity productEntity = new ProductEntity();
        return productEntity;
    }

    @Override
    public List<ProductEntity> getAllProducts() {
        return List.of();
    }
}
