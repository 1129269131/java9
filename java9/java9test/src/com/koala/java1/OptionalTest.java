package com.koala.java1;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

/**
 * day09：Optional提供的stream()
 * Create by koala on 2021-08-07
 */
public class OptionalTest {

    //Optional类中提供了转换为Stream的方法：stream()
    @Test
    public void test1() {

        List<String> list = new ArrayList<>();
        list.add("Tom");
        list.add("Jerry");
        list.add("Tim");

        Optional<List<String>> optional = Optional.ofNullable(list);

        Stream<List<String>> stream1 = optional.stream();
        Stream<String> stream2 = optional.stream().flatMap(x -> x.stream());

        /*System.out.println(stream1.count());
        System.out.println(stream2.count());*/

        stream1.forEach(System.out::println);
        stream2.forEach(System.out::println);
    }

}
