package com.josh.login.controller;

import com.alibaba.fastjson.JSON;
import com.josh.login.dao.UserDao;
import com.josh.login.entity.User;
import com.josh.login.service.RegiesterService;
import com.josh.utils.ContextUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by yunyi on 2016/10/14.
 */
@Controller
public class UserController extends BaseController{

    @Autowired
    private RegiesterService regiesterService;

    @RequestMapping(value="/Register",method= RequestMethod.GET)
    public void register(HttpServletRequest request, HttpServletResponse response) throws Exception {
        String userName = (String) request.getParameter("name");
        String passWord = (String) request.getParameter("pwd");

        int code = regiesterService.register(userName, passWord, "");
        System.out.println("�����codeΪ" + code);

        List<User> users = new ArrayList<User>();
        users = regiesterService.getAll();

        Map<String, Object> map = new HashMap<String,Object>();
        if (code >= 1){
            map.put(RESULT_KEY, users);
        }
        String result = JSON.toJSONString(map);

        PrintWriter printWriter = response.getWriter();
        printWriter.write(result);
        printWriter.close();
    }

    @RequestMapping(value = "/Login",method=RequestMethod.POST)
    public void login(HttpServletRequest req, HttpServletResponse resp) throws Exception {

        String userName = (String) req.getAttribute("uname");
        String passWord = (String) req.getAttribute("upwd");

        System.out.println("�����userNameΪ" + userName + "\n�����passWordΪ" + passWord);

    }

    @RequestMapping("/getAll")
    public String getAllList(){

        System.out.println("GET ALL LIST");
        return "showAll";
    }
}
