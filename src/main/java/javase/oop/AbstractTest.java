package javase.oop;

public abstract class AbstractTest {

    public abstract void method();

    public static void main(String[] args) {
//        AbstractTest abstractTest = new AbstractTest(); 错误，抽象类不能被实例化
    }
}

class SubAbstractTest extends AbstractTest {

    @Override
    public void method() {

    }
}
