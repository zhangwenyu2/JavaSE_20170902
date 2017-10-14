package javase.oop;

public class ParameterPass {

    private static void method(boolean i) {
        System.out.println(i); // 0
        i=false;
        System.out.println(i); // 1
    }

    public static void main(String[] args) {
       // int i = 0;

        boolean i=true;
        System.out.println(i); // 0
        method(i);
        System.out.println(i); // 0
    }
}