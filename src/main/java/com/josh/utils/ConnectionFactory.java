package com.josh.utils;

import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

/**
 * Created by yunyi on 2016/10/14.
 */
public class ConnectionFactory {
    // ������ĸ���Ա�������ڱ�������ݿ��ж�ȡ��������Ϣ
    private static String driver;
    private static String dburl;
    private static String user;
    private static String password;

    private static ConnectionFactory mConnectionFactory = new ConnectionFactory();

    private ConnectionFactory() {

    }

    //ʹ�þ�̬���������ʼ���ĸ�������Ϣ
    static {

        Properties properties = new Properties();

        try {
            InputStream inputStream = ConnectionFactory.class.getClassLoader()
                    .getResourceAsStream("db.properties");
            properties.load(inputStream);

        } catch (Exception e) {
            e.printStackTrace();
        }
        driver = properties.getProperty("driver");
        dburl = properties.getProperty("dburl");
        user = properties.getProperty("user");
        password = properties.getProperty("password");
    }

    //��ȡConnectionFactory����
    public static ConnectionFactory getInstance() {
        return mConnectionFactory;
    }

    private Connection mConnection;

    public Connection makeConnection(){
        try {
            Class.forName(driver);
            mConnection = DriverManager.getConnection(dburl, user, password);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return mConnection;
    }
}
