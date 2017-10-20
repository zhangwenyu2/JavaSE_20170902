package javase.generic;

import java.util.Vector;


public class GenericTest<T> { // Type parameter list
    // generic 通用的\ [dʒɪ'nerɪk] 泛型 JDK5 Tiger
    // general 一般\ ['dʒen\(ə\)r\(ə\)l]
/*
    public String concat(int x, int y) {
        return String.valueOf(x) + String.valueOf(y);
    }
    public String concat(double x, double y) {
        return String.valueOf(x) + String.valueOf(y);
    }
    public String concat(boolean x, boolean y) {
        return String.valueOf(x) + String.valueOf(y);
    }
*/

    public String concat(T x, T y) {
        return String.valueOf(x) + String.valueOf(y);
    }

    public static void main(String[] args) {
        GenericTest<Integer> genericTest = new GenericTest<>();
        System.out.println(genericTest.concat(1, 2));

        GenericTest<Double> genericTest1 = new GenericTest<>();
        System.out.println(genericTest1.concat(1d, 2d));

        GenericTest<Boolean> genericTest2 = new GenericTest<>();
        System.out.println(genericTest2.concat(true ,false));

        Vector<String> vector = new Vector<>();
     //   vector.add(true);
        vector.add("hi");
        vector.add("hello");

        System.out.println(vector.size());
        String s = vector.get(0); // cast Type safe
        System.out.println(s);
    }
}