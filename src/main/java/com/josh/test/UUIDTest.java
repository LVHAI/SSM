package com.josh.test;

import com.josh.utils.UUIDGenerate;
import org.junit.Test;

/**
 * Created by Josh_Lv on 16/10/18.
 */
public class UUIDTest {

    @Test
    public void UUIDTest(){
        String generate = UUIDGenerate.getUUID();

        System.out.println(generate);
    }
}
