package com.webshop.model;

public class ProductLine {

    private Integer productLine;
    private String textDescription;

    public ProductLine(Integer productLine, String textDescription) {
        this.productLine = productLine;
        this.textDescription = textDescription;
    }

    public Integer getProductLine() {
        return productLine;
    }

    public void setProductLine(Integer productLine) {
        this.productLine = productLine;
    }

    public String getTextDescription() {
        return textDescription;
    }

    public void setTextDescription(String textDescription) {
        this.textDescription = textDescription;
    }
}
