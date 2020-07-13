package com.advanced.shop.online.shop.modell;

import com.advanced.shop.online.shop.modell.enums.Currency;

public class Invoice {

    private Long id;
    private String date;
    private Long amount;
    private Currency currency = Currency.BGN;

    public Long getId() {
        return id;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public Long getAmount() {
        return amount;
    }

    public void setAmount(Long amount) {
        this.amount = amount;
    }

    public Currency getCurrency() {
        return currency;
    }

    public void setCurrency(Currency currency) {
        this.currency = currency;
    }
}
