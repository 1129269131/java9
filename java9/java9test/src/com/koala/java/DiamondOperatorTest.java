package com.koala.java;

import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

/**
 * day03：钻石操作符的使用升级
 * Create by koala on 2021-08-07
 */
public class DiamondOperatorTest {

    @Test
    public void testDiamondOperator() {
        diamondOperator();
    }

    public static void diamondOperator() {
        //创建一个继承于HashSet的匿名子类的对象
        Set<String> set = new HashSet<>() {};//编译通过
        set.add("MM");
        set.add("JJ");
        set.add("GG");
        set.add("DD");

        for (String s : set) {
            System.out.println(s);
        }
    }

}
