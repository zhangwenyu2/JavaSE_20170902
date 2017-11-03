package javase.thread;

public class ObjectTest {
    public static void main(String[] args) throws InterruptedException {
//        wait notify notifyAll
//        Object o = new Object();
//        System.out.println(o);
//        o.wait();
//        o.notify();
//        o.notifyAll();

//        String s = "test";
//        s.wait();
//        s.notify();
//        s.notifyAll();

        Object o = new Object();
//        Object lock = new Object();

//        synchronized (o) {
//            o.wait();
//        }

        synchronized (o) {
//            o.notify();
            o.notifyAll();
            System.out.println("test...");
            o.wait();
        }
    }
}