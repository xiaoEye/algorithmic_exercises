package Concurrent.Test;

import java.lang.reflect.Field;

@SuppressWarnings("deprecation")
public class Main {

    public static void main(String[] args) throws NoSuchFieldException {

        Field a = PersonTest.class.getDeclaredField("a");
//        a.setAccessible(true);
        Person annotation = a.getAnnotation(Person.class);
        System.out.println(annotation.id());
        System.out.println(annotation.msg());

    }
}
