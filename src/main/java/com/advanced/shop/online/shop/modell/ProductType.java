package com.advanced.shop.online.shop.modell;

import com.advanced.shop.online.shop.modell.enums.ProductTypeGender;

public class ProductType {

    private Long id;
    private String category;
    private ProductTypeGender productTypeGender = ProductTypeGender.NONE;
    private String description;

    public Long getId() {
        return id;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public ProductTypeGender getProductTypeGender() {
        return productTypeGender;
    }

    public void setProductTypeGender(ProductTypeGender productTypeGender) {
        this.productTypeGender = productTypeGender;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
