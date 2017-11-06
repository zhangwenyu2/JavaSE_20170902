package javase.Inner;

//局部内部类
public class Demo3 {
    public static void main(String[] args) {
        Out3 out3 = new Out3();
        out3.print(18);
    }
}

class Out3 {
    private int age = 17;

    public void print(final int x) {
        class In {
            private void inPrint() {
                System.out.println(age);
                System.out.println(x);
            }
        }
//        new In().inPrint();
        In in = new In();
        in.inPrint();
    }
}
