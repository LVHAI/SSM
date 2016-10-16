package com.josh.login.entity;

/**
 * Created by yunyi on 2016/10/14.
 */
public class User extends IdEntity{
    private String name;
    private String password;
    private String token;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }
}
