package com.advanced.shop.online.shop.modell;

public class Order {

    private Long id;
    private String orderDate;
    private OrderedProduct orderedProduct;

    public Long getId() {
        return id;
    }

    public String getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(String orderDate) {
        this.orderDate = orderDate;
    }

    public OrderedProduct getOrderedProduct() {
        return orderedProduct;
    }

    public void setOrderedProduct(OrderedProduct orderedProduct) {
        this.orderedProduct = orderedProduct;
    }
}
