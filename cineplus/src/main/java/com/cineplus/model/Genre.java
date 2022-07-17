package com.cineplus.model;

public class Genre {
    
    private Integer id;
    private String genrename;

    public Genre() {
        
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getGenrename() {
        return genrename;
    }

    public void setGenrename(String genrename) {
        this.genrename = genrename;
    }
}
