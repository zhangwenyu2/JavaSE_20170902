package javase.io;

import java.io.File;


public class ListTest {
    public static void main(String[] args) {
        File file = new File("/"); // unix linux

        String[] files = file.list();
        if (files != null) {
//            System.out.println(files.length);
            for (String filenName : files) {
                System.out.println(filenName);
            }
        }
    }

    /*
    / |-f1
      |-f2
      |-d1
          |-f11
          |-f22
     */
}