package com.webshop.model;

public class Product {

    private Long productCode;
    private String productName;
    private Integer productLine;
    private String productDescription;
    private Integer productInStock;
    private Float price;

    public Product(Long productCode, String productName, Integer productLine, String productDescription, Integer productInStock, Float price) {
        this.productCode = productCode;
        this.productName = productName;
        this.productLine = productLine;
        this.productDescription = productDescription;
        this.productInStock = productInStock;
        this.price = price;
    }

    public Long getProductCode() {
        return productCode;
    }

    public void setProductCode(Long productCode) {
        this.productCode = productCode;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public Integer getProductLine() {
        return productLine;
    }

    public void setProductLine(Integer productLine) {
        this.productLine = productLine;
    }

    public String getProductDescription() {
        return productDescription;
    }

    public void setProductDescription(String productDescription) {
        this.productDescription = productDescription;
    }

    public Integer getProductInStock() {
        return productInStock;
    }

    public void setProductInStock(Integer productInStock) {
        this.productInStock = productInStock;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }
}
