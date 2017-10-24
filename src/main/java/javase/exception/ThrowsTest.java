package javase.exception;

import java.io.FileNotFoundException;


public class ThrowsTest {

    public void method() throws FileNotFoundException {
        // ...
        int x = 1/0;
    }

    public void test() {
        try {
            method();
        } catch (FileNotFoundException e) {

        }
    }
}