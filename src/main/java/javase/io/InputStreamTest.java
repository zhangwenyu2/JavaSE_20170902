package javase.io;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;


public class InputStreamTest {
    public static void main(String[] args) {

        InputStream inputStream = null;
        try {
            inputStream = new FileInputStream(".gitignore");
            int i;
            while ((i = inputStream.read()) != -1) {
                System.out.print((char) i);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

// 中