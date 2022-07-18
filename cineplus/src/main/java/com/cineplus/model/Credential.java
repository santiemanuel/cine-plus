package com.cineplus.model;

import com.lambdaworks.crypto.SCryptUtil;

public class Credential {

    private Integer id;
    private String salt_and_hash;
    private String pass_algo;
    private Integer id_user;

    public Credential() {

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSalt_and_hash() {
        return salt_and_hash;
    }

    public void setSalt_and_hash(String pass) {
        this.salt_and_hash = SCryptUtil.scrypt(pass, 16384, 8, 1);
        this.pass_algo = "scrypt";
    }

    public void setHash(String pass){
        this.salt_and_hash = pass;
    }

    public Boolean checkPassword(String pass){
        return SCryptUtil.check(pass, salt_and_hash);
    }

    public String getPass_algo() {
        return pass_algo;
    }

    public void setPass_algo(String pass_algo) {
        this.pass_algo = pass_algo;
    }

    public Integer getId_user() {
        return id_user;
    }

    public void setId_user(Integer id_user) {
        this.id_user = id_user;
    }

    @Override
    public String toString() {
        return "Credential{" + "id=" + id + ", salt_and_hash=" + salt_and_hash + ", pass_algo=" + pass_algo + ", id_user=" + id_user + '}';
    }
}
