package javase.language_basic;

import javase.oop.Asian;
import javase.oop.AccessModifierTest;

import java.util.Scanner;

//import java.lang.String;

/**
 * @author mingfei.net@gmail.com
 * @link https://github.com/thu/JavaSE_20170902/
 * @since 14:14 24 Sep 2017
 */
public class Test extends AccessModifierTest {

//    public static void main(String[] args) {
//
//        // FQN Fully Qualified Name 全限定名
//        cn.edu.tsinghua.javase.oop.Test test = new cn.edu.tsinghua.javase.oop.Test();
//        test.test();
//
//        Asian asian = new Asian("");
//
//        HelloWorld helloWorld = new HelloWorld();
//
//        String s = "hi";
//
////        Scanner
//
//        System.out.println();
//
//        AccessModifierTest accessModifierTest = new AccessModifierTest();
//
//
//    }

    public static void main(String[] args) {
        AccessModifierTest accessModifierTest = new AccessModifierTest();
//        System.out.println(accessModifierTest.i);
//        System.out.println(accessModifierTest.d);
//        System.out.println(accessModifierTest.b);
        System.out.println(accessModifierTest.s);

//        accessModifierTest.m1();
//        accessModifierTest.m2();
//        accessModifierTest.m3();
        accessModifierTest.m4();

        Test test = new Test();   //在外包中若要调用受保护的类成员，先要用外包中其子类创建一个对象，再用子类对象访问。
        System.out.println(test.d);
        test.m2();
    }
}