package javase.Inner;

//匿名内部类
public class Demo4 {
    public static void main(String[] args) {
//        Father child = new Child();
//        child.study();

        new Father(){
            @Override
            public void study() {
                System.out.println("study...");
            }
        }.study();

        Super aSuper = new Super() {
            @Override
            public void method() {

            }
        };

        aSuper.method();

        ((Super) () -> System.out.println("method...")).method(); //
    }
}

interface Super {
    void method();
}

abstract class Father {
    public abstract void study();
}

//class Child extends Father {
//    @Override
//    public void study() {
//        System.out.println("Child is study...");
//    }
//}
