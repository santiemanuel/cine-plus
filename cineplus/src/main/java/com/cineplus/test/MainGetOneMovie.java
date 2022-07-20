package com.cineplus.test;

import com.cineplus.dao.DAOMovie;
import com.cineplus.model.Movie;

public class MainGetOneMovie {
    
    public static void main(String[] args) {
        
        Movie movie = new Movie();

        DAOMovie daoMovie = new DAOMovie();

        movie = daoMovie.getMovieById(169);

        System.out.println("Título: " +movie.getTitle());
        System.out.println("Sinopsis: " + movie.getDescription());
        System.out.println("Duración: " + movie.getRuntime());
        System.out.println("Fecha de Lanzamiento: " + movie.getRelease_date());
        System.out.println("ID de imdb: " + movie.getId_imdb());
        
    }

}
