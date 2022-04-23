package top.ximimi.springdemo.java8;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

@SpringBootTest
public class JDK8FeatureTests {

    @Test
    void testFunctionalInterface(){
        Consumer<String> consumer =System.out::println;
        consumer.accept("Hello Consumer");

        Supplier<String> stringSupplier = ()->"Hello Supplier";
        System.out.println(stringSupplier.get());

        Function<String,String> function = e->e;
        String hello_function = function.apply("Hello function");
        System.out.println(hello_function);

        Predicate<Integer> predicate = num->num>10?true:false;
        System.out.println(predicate.test(5));

    }



}
