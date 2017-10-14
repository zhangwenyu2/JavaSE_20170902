package javase.oop;

public class FinalTest {
    private final int i;

    public FinalTest() {
        i = 0;
    }

    public FinalTest(int i) {
        this.i = i;
    }

    public final void method() {

    }

    public static void main(String[] args) {
        FinalTest finalTest = new FinalTest();
//        finalTest.i = 1;

        FinalTest finalTest1 = new FinalTest(1);
    }
}

class SubFinalTest extends FinalTest {
//    @Override
//    public void method() {
//
//    }
}
