package com.fancky.model.entity.test;

public class Product {
    private Integer id;

    private String productName;

    public Product(Integer id, String productName) {
        this.id = id;
        this.productName = productName;
    }

    public Product() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName == null ? null : productName.trim();
    }
}