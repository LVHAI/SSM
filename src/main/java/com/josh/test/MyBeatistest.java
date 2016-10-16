package com.josh.test;

import com.josh.login.entity.User;
import com.josh.login.service.RegiesterService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


/**
 * Created by yunyi on 2016/10/14.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring-mybatis.xml"})

public class MyBeatistest {

    @Autowired
    RegiesterService regiesterService;

    @Test
    public void test1(){

        User user = new User();
        user.setName("josh-Lv");
        user.setPassword("123456");
//        user.setAge(28);
        int id = regiesterService.register("josh-Lv","888888","dahai");
        System.out.println(id);
    }
//    public void testAdd(){
//        ApplicationContext ctx=null;
//        ctx=new ClassPathXmlApplicationContext("applicationContext.xml");
//        UserDao userDao=(UserDao) ctx.getBean("userDao");
//        User user=new User();
//    }

}
