package javase.reflect;

import java.lang.reflect.Method;


public class MethodsTest {
    public static void main(String[] args) {
        for (Method method : Human.class.getMethods()) {
            System.out.println(method.getName());
        }
        System.out.println("---");
        for (Method method : Human.class.getDeclaredMethods()) {
            System.out.println(method);
        }
    }
}