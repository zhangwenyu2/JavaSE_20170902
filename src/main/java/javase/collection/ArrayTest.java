package javase.collection;

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

        double[] doubles={1.2,2.3,4.5};

        System.out.println(ints[0]);
        System.out.println("---"+doubles.length);

        for (int i = 0; i <ints.length ; i++) {
            ints[i]=i;
        }

        for (int i = 0; i <ints.length ; i++) {
            System.out.println(ints[i]);
        }

        //for-each循环：iter+Tab 快捷键
        for (double aDouble : doubles) {
            System.out.println(aDouble);
        }

    }


}
