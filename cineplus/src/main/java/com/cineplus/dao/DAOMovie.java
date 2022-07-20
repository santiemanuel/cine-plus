package com.cineplus.dao;

import com.cineplus.model.Movie;

import com.cineplus.sql.DbConnection;
import com.cineplus.sql.SQLQueries;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DAOMovie {
    

    public DAOMovie(){

    }

    public Movie getMovieById(Integer id) {
        
        DbConnection conn = new DbConnection();

        try {
            PreparedStatement pstmt = conn.getConnection().prepareStatement(SQLQueries.GET_MOVIE_BY_ID);
            pstmt.setInt(1, id);
            pstmt.execute();
            ResultSet rs = pstmt.getResultSet();

            if (rs.next()) {
                Movie movie = new Movie();
                movie.setId(rs.getInt("id_movie"));
                movie.setTitle(rs.getString("title"));
                movie.setDescription(rs.getString("description"));
                movie.setRuntime(rs.getInt("runtime"));
                movie.setRelease_date(rs.getDate("release_date").toLocalDate());
                movie.setId_imdb(rs.getString("id_imdb"));
                return movie;
            }

            rs.close();
            pstmt.close();
            conn.disconnect();
        } catch (SQLException e){
            e.printStackTrace();
        }
        return null;
    }   
}