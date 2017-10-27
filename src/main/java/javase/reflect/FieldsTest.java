package javase.reflect;

import java.lang.reflect.Field;


public class FieldsTest {
    public static void main(String[] args) {
        for (Field field : Human.class.getFields()) {
            System.out.println(field.getName());
        }
        System.out.println("---");
        for (Field field : Human.class.getDeclaredFields()) {
            // 宣布\ [dɪ'kleəd]
            System.out.println(field.getName());
        }
    }
}
