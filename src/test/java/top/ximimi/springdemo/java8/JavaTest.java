package top.ximimi.springdemo.java8;
import org.junit.jupiter.api.Test;

public class JavaTest {
    String ss;

    /*
     JAVA类成员变量，虚拟机默认会初始化，对不同类型的变量进行初始化赋值
     */
    @Test
    void testVariableInJavaClass() {
        System.out.println(this.ss);
    }

    /*
    JAVA方法中申明的局部变量必须初始化
     */
    @Test
    void testVariableInJavaFunction() {
        String line = "";
        System.out.println(line);
    }
}
