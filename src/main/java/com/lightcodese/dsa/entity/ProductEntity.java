package com.lightcodese.dsa.entity;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class ProductEntity {
    private int id;
    private String name;
    private BigDecimal price;
}
