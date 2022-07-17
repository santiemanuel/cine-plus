package com.cineplus.model;

public class Discount {
 
    private Integer id;
    private Integer amount;

    public Discount() {
 
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "Discount{" + "id=" + id + ", amount=" + amount + '}';
    }
}
