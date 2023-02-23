package top.ximimi.springdemo.util;

import com.fasterxml.jackson.databind.ser.Serializers;

import java.io.UnsupportedEncodingException;
import java.util.Base64;

public class Base64Utils {
    private static final Base64.Decoder decoder = Base64.getDecoder();
    private static final Base64.Encoder encoder = Base64.getEncoder();


    public static String encode(String txt) {
        byte[] textByte = new byte[0];
        try {
            textByte = txt.getBytes("UTF-8");
            String encodedText = encoder.encodeToString(textByte);
            return encodedText;
        } catch (UnsupportedEncodingException e) {
            System.out.println(e.getMessage());
        }
        return "ENCODE ERROR";
    }

    public static String decode(String encodedTxt){
        String text = null;
        try {
            text = new String(decoder.decode(encodedTxt),"UTF8");
            return text;
        } catch (UnsupportedEncodingException e) {
            System.out.println(e.getMessage());
        }
        return "DECODE ERROR";
    }
}
