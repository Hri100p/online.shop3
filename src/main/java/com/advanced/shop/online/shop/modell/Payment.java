package com.advanced.shop.online.shop.modell;

import com.advanced.shop.online.shop.modell.enums.PaymentType;

public class Payment {
    private Long id;
    private PaymentType paymentType = PaymentType.NONE;
    private Long totalAmount;

    public Long getId() {
        return id;
    }

    public PaymentType getPaymentType() {
        return paymentType;
    }

    public void setPaymentType(PaymentType paymentType) {
        this.paymentType = paymentType;
    }

    public Long getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(Long totalAmount) {
        this.totalAmount = totalAmount;
    }
}
