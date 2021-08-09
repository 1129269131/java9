package com.koala.java1;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * day07：创建只读集合
 * Create by koala on 2021-08-07
 */
public class CollectionMapTest {

    //jdk8 以及之前：创建一个只读特点的集合
    @Test
    public void test1() {

        List<String> list = new ArrayList<>();
        list.add("Tom");
        list.add("Jerry");
        list.add("Lilei");
        list.add("HanMeimei");

        //调用Collections中的方法，将list变为只读的
        List<String> newList = Collections.unmodifiableList(list);

        newList.add("Tim");//不能执行，否则报异常

        //遍历：jdk8
        newList.forEach(System.out::println);

    }

    //jdk8 以及之前：创建一个只读特点的集合
    @Test
    public void test2() {

        //List:
        List<Integer> list = Collections.unmodifiableList(Arrays.asList(1, 2, 3));
        list.add(4);

        list.forEach(System.out::println);

    }

    //jdk8 以及之前：创建一个只读特点的集合
    @Test
    public void test3() {

        //Set:
        Set<Integer> set = Collections.unmodifiableSet(new HashSet<>(Arrays.asList(1, 2, 3)));
        set.add(4);

        set.forEach(System.out::println);

    }

    //jdk8 以及之前：创建一个只读特点的集合
    @Test
    public void test4() {

        //Map:
        Map<Object, Object> map = Collections.unmodifiableMap(new HashMap<>() {
            {
                put("Tom", 78);
                put("Jerry", 88);
                put("Tim", 68);
            }
        });
        map.put("koala", 26);

        map.forEach((k, v) -> System.out.println(k + ":" + v));

    }

    //jdk9 中：创建一个只读特点的集合
    @Test
    public void test5() {
        //List:
        List<Integer> list = List.of(1, 2, 3);
        list.add(4);

        //Set:
        Set<Integer> set = Set.of(2, 3, 4);
        //set.add(6);

        //Map:
        //创建只读集合的方式一：
        Map<String, Integer> map = Map.of("Tom", 23, "Jerry", 22, "Lilei", 12, "HanMeimei", 18);
        //map.put("Tim",33);

        //创建只读集合的方式二：
        Map<String, Integer> map1 = Map.ofEntries(Map.entry("Tom", 23), Map.entry("Jerry", 21));
        //map1.put("Tim",33);
    }

}
