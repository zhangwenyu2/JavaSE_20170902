package javase.oop;

public class StaticTest {

        private static int i;
        private String name;

        public static void method() {

        }

        public static void main(String[] args) {
            StaticTest tom = new StaticTest();
            tom.name = "Tom";
            tom.i = 1;

            System.out.println(tom.name);
            System.out.println(tom.i); // 1

            StaticTest jerry = new StaticTest();
            jerry.name = "Jerry";

            System.out.println(jerry.name);
            System.out.println(jerry.i); // 0
        }
}
