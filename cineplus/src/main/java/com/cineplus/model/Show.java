package com.cineplus.model;

import java.time.LocalDate;
import java.time.LocalTime;

public class Show {
    
    private Integer id;
    private Integer screen_type;
    private Integer movie_id;
    private Integer room_id;
    private LocalDate date;
    private LocalTime time;

    public Show() {
        
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getScreen_type() {
        return screen_type;
    }

    public void setScreen_type(Integer screen_type) {
        this.screen_type = screen_type;
    }

    public Integer getMovie_id() {
        return movie_id;
    }

    public void setMovie_id(Integer movie_id) {
        this.movie_id = movie_id;
    }

    public Integer getRoom_id() {
        return room_id;
    }

    public void setRoom_id(Integer room_id) {
        this.room_id = room_id;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public LocalTime getTime() {
        return time;
    }

    public void setTime(LocalTime time) {
        this.time = time;
    }

    @Override
    public String toString() {
        return "Show{" + "id=" + id + ", screen_type=" + screen_type + ", movie_id=" + movie_id + ", room_id=" + room_id + ", date=" + date + ", time=" + time + '}';
    }
}