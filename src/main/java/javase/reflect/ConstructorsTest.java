package javase.reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Parameter;


public class ConstructorsTest {
    public static void main(String[] args) throws IllegalAccessException, InvocationTargetException, InstantiationException {
        for (Constructor<?> constructor : Human.class.getConstructors()) {
            System.out.println(constructor.getName());
            for (Parameter parameter : constructor.getParameters()) {
                System.out.println("\t" + parameter);
            }
            Human human = (Human) constructor.newInstance(20, 60, "Tom", false);
//            Human human = new Human();
            System.out.println(human.getName());
        }
        System.out.println("---");
        for (Constructor<?> constructor : Human.class.getDeclaredConstructors()) {
            System.out.println(constructor.getName());
            for (Parameter parameter : constructor.getParameters()) {
                System.out.println("\t" + parameter);
            }
        }
    }
}