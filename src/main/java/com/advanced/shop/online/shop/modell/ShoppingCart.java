package com.advanced.shop.online.shop.modell;

public class ShoppingCart {

    private Long id;
    private Long totalAmount;
    private OrderedProduct orderedProduct;

    public Long getId() {
        return id;
    }

    public Long getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(Long totalAmount) {
        this.totalAmount = totalAmount;
    }

    public OrderedProduct getOrderedProduct() {
        return orderedProduct;
    }

    public void setOrderedProduct(OrderedProduct orderedProduct) {
        this.orderedProduct = orderedProduct;
    }
}
