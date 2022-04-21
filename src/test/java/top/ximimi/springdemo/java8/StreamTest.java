package top.ximimi.springdemo.java8;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class StreamTest {


    @Test
    void testStreamForEach(){
        List<Integer> numbers = Arrays.asList(3, 2, 2, 3, 7, 3, 5);
        numbers.stream().forEach(System.out::println);
    }

    @Test
    void testStreamMap(){

        List<Integer> numbers = Arrays.asList(3, 2, 2, 3, 7, 3, 5);
// 获取对应的平方数
        List<Integer> squaresList =
                numbers.stream().map( i -> i*i).collect(Collectors.toList());

        System.out.println(squaresList);
    }

    @Test
    void testStreamFilter(){
        List<String>strings = Arrays.asList("abc", "", "bc", "efg", "abcd","", "jkl");
// 获取空字符串的数量
        long count = strings.stream().filter(string -> string.isEmpty()).count();
        System.out.println(count);

    }

    @Test
    void testStreamLimitAndSort(){
        Random random = new Random();
        random.ints().limit(10).forEach(System.out::println);
        System.out.println("----------------------------------");
        random.ints().limit(10).sorted().forEach(System.out::println);
    }



}
