package javase.oop;

public interface InterfaceTest {

    int ZERO=0; // 接口的域都是公有常量；

    void method(); //接口的方法都是公有的抽象方法；
}

class InterfaceTestImpl implements InterfaceTest {

    @Override
    public void method() {

    }
}

interface A {
    void a();
}

interface B {
    void b();
}

interface C {
    void c();
}

interface D {
    void d();
}


class AbcdImpl implements A, B, C, D {
    @Override
    public void a() {

    }

    @Override
    public void b() {

    }

    @Override
    public void c() {

    }

    @Override
    public void d() {

    }
}

interface E extends A, B, C, D {
    void e();
}

class EImpl implements E {
    @Override
    public void a() {

    }

    @Override
    public void b() {

    }

    @Override
    public void c() {

    }

    @Override
    public void d() {

    }

    @Override
    public void e() {

    }
}
