package javase.oop;

public class ArrayTest {
    public static void main(String[] args) {

        //声明
        int[] ints;
        boolean[] booleans;

        //初始化
        ints = new int[10];
        booleans= new boolean[1000];

        //声明和初始化一起
        String[] strings=new String[5];

        System.out.println(ints[0]);

        for (int i = 0; i <ints.length ; i++) {
            ints[i]=i;
        }

        for (int i = 0; i <ints.length ; i++) {
            System.out.println(ints[i]);
        }

    }


}
