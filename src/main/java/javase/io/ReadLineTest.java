package javase.io;

import java.io.*;


public class ReadLineTest {
    public static void main(String[] args) {

        try (BufferedReader reader = new BufferedReader(new FileReader("src/main/java/cn/edu/tsinghua/javase/io/ReadLineTest.java"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

class SuperClass {

}

class SubClass extends SuperClass {

    public void method() {
    }

//    public static void main(String[] args) {
//        SuperClass subClass = new SubClass();
//        subClass.method();
//    }
}

