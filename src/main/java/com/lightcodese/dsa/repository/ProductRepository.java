package com.lightcodese.dsa.repository;

import com.lightcodese.dsa.entity.ProductEntity;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository {
    ProductEntity createProduct(ProductEntity product);
    List<ProductEntity> getAllProducts();
}
