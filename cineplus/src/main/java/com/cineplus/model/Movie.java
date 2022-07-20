package com.cineplus.model;

import java.time.LocalDate;

public class Movie {
    
    private Integer id;
    private String title;
    private String description;
    private Integer runtime;
    private LocalDate release_date;
    private Integer id_imdb;

    public Movie() {

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getRuntime() {
        return runtime;
    }

    public void setRuntime(Integer runtime) {
        this.runtime = runtime;
    }

    public LocalDate getRelease_date() {
        return release_date;
    }

    public void setRelease_date(LocalDate release_date) {
        this.release_date = release_date;
    }

    public Integer getId_imdb() {
        return id_imdb;
    }

    public void setId_imdb(Integer id_imdb) {
        this.id_imdb = id_imdb;
    }

    @Override
    public String toString() {
        return "Movie{" + "id=" + id + ", title=" + title + ", description=" + description + ", runtime=" + runtime + ", release_date=" + release_date + ", id_imdb=" + id_imdb + '}';
    }
    
}
