package top.ximimi.springdemo.java8;

import org.junit.jupiter.api.Test;
import top.ximimi.springdemo.util.Base64Utils;

import java.util.Base64;

public class EncryptionTest {

    @Test
    void testBase64(){

        String encode = Base64Utils.encode("Eg");
        System.out.println(encode);
        System.out.println(encode.length());
        String encode1 = Base64Utils.encode("Eggplant@#567890");
        System.out.println(encode1);
        System.out.println(encode1.length());
        String encode2 = Base64Utils.encode("Eggplant@#567899");
        System.out.println(encode2);
        System.out.println(encode2.length());
    }

}
