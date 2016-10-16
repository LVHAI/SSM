package com.josh.utils;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by yunyi on 2016/10/14.
 */
public class ContextUtils {
    private static final String APPLICATION_XML = "applicationContext.xml";

    private static ApplicationContext context;

    public static ApplicationContext getContext(){
        if (context == null) {
            context = new ClassPathXmlApplicationContext(APPLICATION_XML);
        }
        return context;
    }
}
