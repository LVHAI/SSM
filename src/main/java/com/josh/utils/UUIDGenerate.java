package com.josh.utils;

import java.util.UUID;

/**
 * Created by Josh_Lv on 16/10/18.
 */
public class UUIDGenerate {

    public static String getUUID(){
       //生成UUID
        UUID uuid = UUID.randomUUID();
//        把生成的UUID转换成String
        String str = uuid.toString();
//        把转换成string的UUID中间的-去除
        String token = str.substring(0, 8) + str.substring(9, 13)
                + str.substring(14, 18) + str.substring(19, 23)
                + str.substring(24);
        return token;
    }
}
