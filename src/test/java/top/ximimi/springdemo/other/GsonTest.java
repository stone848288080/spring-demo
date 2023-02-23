package top.ximimi.springdemo.other;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.ToNumberPolicy;
import com.google.gson.internal.LazilyParsedNumber;
import com.google.gson.reflect.TypeToken;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GsonTest {


    @Test
    public void testGson1(){
        Gson gson = new GsonBuilder()
                .setObjectToNumberStrategy(ToNumberPolicy.DOUBLE) // explicit default, may be omitted
                .create();
        List<Object> actual = gson.fromJson("[null, 10, 10.0]", new TypeToken<List<Object>>() {}.getType());
        List<Double> expected = Arrays.asList(null, 10.0, 10.0);
        assertEquals(expected, actual);

    }

    @Test
    public void testGson2(){
        Gson gson = new GsonBuilder()
                .setNumberToNumberStrategy(ToNumberPolicy.LAZILY_PARSED_NUMBER) // explicit default, may be omitted
                .create();
        List<Number> actual = gson.fromJson("[null, 10, 10.0]", new TypeToken<List<Number>>() {}.getType());
        List<Object> expected = Arrays.<Object>asList(null, new LazilyParsedNumber("10"), new LazilyParsedNumber("10.0"));
        assertEquals(expected, actual);

    }


    @Test
    public void testGson3(){
        Gson gson = new GsonBuilder()
                .setObjectToNumberStrategy(ToNumberPolicy.DOUBLE) // explicit default, may be omitted
                .create();
        List<Object> actual = gson.fromJson("[null, 10, 10]", new TypeToken<List<Object>>() {}.getType());
        System.out.println(actual);


    }
}
