package javase.collection;

import java.util.*;


public class SingletonListVsArrayList {
    public static void main(String[] args) {
        String[] strings = {"hi", "hello"};
        List<String> list = Arrays.asList(strings); // *****

        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            String next = iterator.next();
            System.out.println(next);
        }

        list = Collections.singletonList("test");

        for (String s : list) {
            System.out.println(s);
        }

        System.out.println(list.size());
    }
}