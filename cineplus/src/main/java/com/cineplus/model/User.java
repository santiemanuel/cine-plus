package com.cineplus.model;

public class User {
    
    private Integer id;

    private String email;
    private Boolean is_admin;

    public User(){

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public Boolean setEmail(String email) {
        Boolean result = isValidEmail(email);
        if(result){
            this.email = email;
        }
        return result;
    }

    private Boolean isValidEmail(String email){
        return email.matches("^[a-zA-Z0-9._-]+@((\\[[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\])|(([a-zA-Z\\-0-9]+\\.)+[a-zA-Z]{2,}))$");
    }

    public Boolean getIs_admin() {
        return is_admin;
    }

    public void setIs_admin(Boolean is_admin) {
        this.is_admin = is_admin;
    }

    @Override
    public String toString() {
        return "User{" + "id=" + id + ", email=" + email + ", is_admin=" + is_admin + '}';
    }
}
