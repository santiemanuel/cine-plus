package com.cineplus.model;

public class Ticket {
    
    private Integer id;
    private Integer id_client;
    private Integer id_show;
    private Integer id_seat;
    private Integer id_discount;
    private Double price;

    public Ticket() {
        
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getId_client() {
        return id_client;
    }

    public void setId_client(Integer id_client) {
        this.id_client = id_client;
    }

    public Integer getId_show() {
        return id_show;
    }

    public void setId_show(Integer id_show) {
        this.id_show = id_show;
    }

    public Integer getId_seat() {
        return id_seat;
    }

    public void setId_seat(Integer id_seat) {
        this.id_seat = id_seat;
    }

    public Integer getId_discount() {
        return id_discount;
    }

    public void setId_discount(Integer id_discount) {
        this.id_discount = id_discount;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Ticket{" + "id=" + id + ", id_client=" + id_client + ", id_show=" + id_show + ", id_seat=" + id_seat + ", id_discount=" + id_discount + ", price=" + price + '}';
    }
}
