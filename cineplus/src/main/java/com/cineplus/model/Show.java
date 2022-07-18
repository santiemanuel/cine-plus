package com.cineplus.model;

import java.time.LocalDate;
import java.time.LocalTime;

public class Show {
    
    private Integer id;
    private Integer screen_type;
    private Integer id_movie;
    private Integer id_room;
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

    public Integer getId_movie() {
        return id_movie;
    }

    public void setId_movie(Integer id_movie) {
        this.id_movie = id_movie;
    }

    public Integer getId_room() {
        return id_room;
    }

    public void setId_room(Integer id_room) {
        this.id_room = id_room;
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
        return "Show{" + "id=" + id + ", screen_type=" + screen_type + ", id_movie=" + id_movie + ", id_room=" + id_room + ", date=" + date + ", time=" + time + '}';
    }
}