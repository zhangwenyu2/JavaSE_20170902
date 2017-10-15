package javase.collection;

import java.util.Vector; // util - utility 实用程序\ [juːˈtɪlɪtɪ]


public class VectorTest {
    public static void main(String[] args) {
        Vector<String> strings = new Vector<>(); // E Element 元素
        strings.add("hi");
        strings.add("hello");

        System.out.println(strings.get(1));
        System.out.println(strings.size());
        System.out.println(strings.capacity()); // 容量,\ 能力,\ 容积

        for (int i = 0; i < 2; i++) {
            strings.add("a");
        }

//        strings.clear();

//        strings.remove(0);

        strings.remove("a");

        strings.set(2, "test");

        System.out.println(strings.size()); // 101
        System.out.println(strings.capacity()); // ?

        System.out.println("---");

        for (String string : strings) {
            System.out.println(string);
        }
    }
}