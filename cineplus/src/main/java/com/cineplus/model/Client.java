package com.cineplus.model;

public class Client {
    
    private Integer id;
    private String name;
    private String surname;
    private Integer id_user;
    private Integer id_preference;

    public Client() {

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Integer getId_user() {
        return id_user;
    }

    public void setId_user(Integer id_user) {
        this.id_user = id_user;
    }

    public Integer getId_preference() {
        return id_preference;
    }

    public void setId_preference(Integer id_preference) {
        this.id_preference = id_preference;
    }

    @Override
    public String toString() {
        return "Client{" + "id=" + id + ", name=" + name + ", surname=" + surname + ", id_user=" + id_user + ", id_preference=" + id_preference + '}';
    }
}
