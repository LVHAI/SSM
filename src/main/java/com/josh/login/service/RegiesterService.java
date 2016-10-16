package com.josh.login.service;

import com.josh.login.entity.User;

import java.util.List;

/**
 * Created by yunyi on 2016/10/14.
 */
public interface RegiesterService {

    public int register(String userName, String passWord, String nickName);
    public List<User> getAll();
}
