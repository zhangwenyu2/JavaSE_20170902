package javase.collection;

    import java.util.Scanner;


    public class ToStringTest {
        public static void main(String[] args) {
//        toString()

//        Scanner scanner = new Scanner(System.in);
//        System.out.println(scanner.toString()); // ?

            ToStringTest toStringTest = new ToStringTest();
            System.out.println(toStringTest.hashCode()); // 对象的哈希码
            System.out.println(Integer.toHexString(toStringTest.hashCode()));
            System.out.println(toStringTest.toString());
            // cn.edu.tsinghua.javase.collection.ToStringTest@66d3c617
            // FQN@HEX

            int[] ints = {1, 2, 3};
            System.out.println(ints);
        }
    }
