package javase.oop;

public class Mankind {

    static {
        System.out.println("static block");
    }

    private static String earth;
    private String name;

    private static final double PI=3.1415926;
    public static void method() {
//        name = ""; 非静态成员不能直接引用,可以通过创建对象来引用
        earth = "";
        Mankind mankind = new Mankind();
        mankind.name = "";
    }

    public static void main(String[] args) {
        Mankind tom = new Mankind();
        tom.name = "Tom";
        Mankind.earth = "tom 种了一棵树";

        System.out.println(tom.name);
        System.out.println(Mankind.earth); // 1

        Mankind jerry = new Mankind();
        jerry.name = "Jerry";

        System.out.println(jerry.name);
        System.out.println(Mankind.earth); // 0
    }
}
