package com.cineplus.model;

public class Room {
    
    private Integer id;
    private String location;
    private Integer capacity;
    private Integer rows;
    private Integer seatsPerRow;

    public Room() {
        
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Integer getCapacity() {
        return capacity;
    }

    public void setCapacity(Integer capacity) {
        this.capacity = capacity;
    }

    public Integer getRows() {
        return rows;
    }

    public void setRows(Integer rows) {
        this.rows = rows;
    }

    public Integer getSeatsPerRow() {
        return seatsPerRow;
    }

    public void setSeatsPerRow(Integer seatsPerRow) {
        this.seatsPerRow = seatsPerRow;
    }

    @Override
    public String toString() {
        return "Room{" + "id=" + id + ", location=" + location + ", capacity=" + capacity + ", rows=" + rows + ", seatsPerRow=" + seatsPerRow + '}';
    }
}
