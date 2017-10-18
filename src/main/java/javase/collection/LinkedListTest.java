package javase.collection;

import java.util.LinkedList;


public class LinkedListTest {
    public static void main(String[] args) {
        LinkedList<Integer> integers = new LinkedList<>();
        // linked v.\ 连接；串联（link的过去分词）
        for (int i = 0; i < 10; i++) {
            integers.add(i);
        }
        System.out.println(integers.size());
        for (Integer integer : integers) {
            System.out.println(integer);
        }
        System.out.println(integers.get(9));
    }
}
