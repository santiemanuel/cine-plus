package com.cineplus.model;

public class Seat {
    
    private Integer id;
    private Integer row;
    private Integer index;

    public Seat() {
        
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getRow() {
        return row;
    }

    public void setRow(Integer row) {
        this.row = row;
    }

    public Integer getIndex() {
        return index;
    }

    public void setIndex(Integer index) {
        this.index = index;
    }

    @Override
    public String toString() {
        return "Seat{" + "id=" + id + ", row=" + row + ", index=" + index + '}';
    }
}