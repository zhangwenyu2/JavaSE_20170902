package javase.oop;

public class Asian extends Human {

        public Asian(String name) {
            super(name);
        }

        // Ctrl + O

        void eat(String s) {
            System.out.println("javase.oop.Asian eat...");
            super.eat(s); // ?
        }

        public static void main(String[] args) {
            Asian asian = new Asian("");
            asian.eat("");
        }
    }
