package com.cineplus.model;

public class Preference {
    
    private Integer id;
    private Integer id_genre;

    public Preference() {
        
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getId_genre() {
        return id_genre;
    }

    public void setId_genre(Integer id_genre) {
        this.id_genre = id_genre;
    }

    @Override
    public String toString() {
        return "Preference{" + "id=" + id + ", id_genre=" + id_genre + '}';
    }
}
