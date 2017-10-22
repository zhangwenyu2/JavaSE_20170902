package javase.oop;

public class StringTest {

    private static void test(String s) {
        s = "hello";
    }

    private static void m(Integer integer) {
        integer ++;
    }

    public static void main(String[] args) {
        String s = "hi";
        test(s);
        System.out.println(s); // hi

        Integer integer = new Integer(2);
        m(integer);
        System.out.println(integer);

//        boolean
//        Boolean

//        byte
//        Byte

//        char
//        Character

//        short
//        Short

//        int
//        Integer

//        long
//        Long

//        float
//        Float

//        double
//        Double
    }


}