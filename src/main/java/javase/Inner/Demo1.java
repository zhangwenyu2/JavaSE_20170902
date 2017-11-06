package javase.Inner;

public class Demo1 {
    public static void main(String[] args) {
//        Out1.In in = (new Out1()).new In();
//        in.print();    成员内部类

        Out1 out = new Out1();
        Out1.In1 in = out.new In1();
        in.print();
    }
}

// Inner class

// class = field + method [+ inner class]

class Out1 {
    private int age = 17;

    class In1 {
        public void print() {
            System.out.println(age);
        }
    }
}