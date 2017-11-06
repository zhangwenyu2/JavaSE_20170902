package javase.Inner;

//静态内部类
public class Demo2 {
    public static void main(String[] args) {
        Out2.In2 in2 = new Out2.In2();
        in2.print();
    }
}

class Out2 {
    private static int age = 17;

    static class In2 {
        public void print() {
            System.out.println(age);
        }
    }
}