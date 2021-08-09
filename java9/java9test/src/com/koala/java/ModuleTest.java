package com.koala.java;

import com.koala.bean.Person;
import org.junit.Test;

import java.util.logging.Logger;

/**
 * day01：
 *      测试java 9 的模块化特性
 * Create by koala on 2021-08-07
 */
public class ModuleTest {

    private static final Logger LOGGER = Logger.getLogger("atguigu");

    public static void main(String[] args) {

        Person p = new Person("Tom",12);

        System.out.println(p);

        //User01 user = new User01();

        LOGGER.info("aaaaaa");

    }

    @Test
    public void test1(){
    }

}
