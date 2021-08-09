package com.koala.java;

/**
 * day06：String底层存储结构的变化
 * String：jdk8 及之前：底层使用char[]存储；jdk9：底层使用byte[] (encoding flag)
 * StringBuffer：jdk8 及之前：底层使用char[]存储；jdk9：底层使用byte[]
 * StringBuilder：jdk8 及之前：底层使用char[]存储；jdk9：底层使用byte[]
 *
 * String：不可变的字符序列；
 * StringBuffer：可变的字符序列；线程安全的，效率低；
 * StringBuilder：可变的字符序列；线程不安全的，效率高（jdk5.0)
 * Create by koala on 2021-08-07
 */
public class StringTest {

    String a;//点进去查看存储结构
    StringBuffer b;//点进去查看父类存储结构
    StringBuilder c;//点进去查看父类存储结构

}
