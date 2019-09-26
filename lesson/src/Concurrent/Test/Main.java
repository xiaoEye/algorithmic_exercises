package Concurrent.Test;

import java.lang.reflect.Field;

public class Main {

    public static void main(String[] args) throws Exception {
        Class<?> c1 = Class.forName("Concurrent.Test.Test");
        Test test = (Test) c1.newInstance();
        System.out.println(test.getAge());
        Field ageFiled = c1.getDeclaredField("age");
        ageFiled.setAccessible(true);
        ageFiled.set(test, "xiaoxu");
        System.out.println(test.getAge());
    }
}
