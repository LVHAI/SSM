package com.josh.login.service.impl;

import com.josh.login.dao.UserDao;
import com.josh.login.entity.User;
import com.josh.login.service.RegiesterService;
import com.josh.utils.ConnectionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by yunyi on 2016/10/14.
 * ����ע��������ݿ�������߼��࣬���������жϣ�����ʱ���ݿ�ع��Ȳ���
 */
@Service("registerService")
public class RegiesterServiceimpl implements RegiesterService{


    @Autowired
    public UserDao userDao;

    public int register(String userName, String passWord, String nickName) {
        User user = new User();
        user.setName(userName);
        user.setPassword(passWord);
        return this.userDao.insertSelective(user);
    }

    public List<User> getAll() {
        List<User> users = new ArrayList<User>();
        users = this.userDao.getAllUser();
        return users;
    }
}
