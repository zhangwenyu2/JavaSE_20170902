package javase.generic;

import java.io.Serializable;

public class Test<T extends Serializable> {

    public T test(T x) {
        // ...
        return x; // true + false = ?
    }

    public static void main(String[] args) {
        Test<A> ta = new Test<>();  //声明了ta为A类型
        System.out.println(ta.test(new A())); //所以要传入一个A类型的实例，用new来生成

//        Test<C> tc = new Test<>();
//        System.out.println(tc.test(new C()));
    }
}

class A implements Serializable {

}

class C {

}