package javase.oop;



public class Test extends Object {

    public void test() {
        System.out.println("oop Test class...");
    }

    public static void main(String[] args) {
        AccessModifierTest accessModifierTest = new AccessModifierTest();
//        System.out.println(AccessModifierTest.i);
        System.out.println(accessModifierTest.d);
        System.out.println(accessModifierTest.b);
        System.out.println(accessModifierTest.s);

//        AccessModifierTest.m1();
        accessModifierTest.m2();
        accessModifierTest.m3();
        accessModifierTest.m4();
    }


}