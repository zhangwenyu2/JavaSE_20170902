package javase.io;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.RandomAccessFile;


public class RandomAccessFileTest {
    public static void main(String[] args) {
        try (RandomAccessFile randomAccessFile = new RandomAccessFile("test", "rw")) {
            for (int i = 0; i < 10; i++) {
                randomAccessFile.writeDouble(i * 0.5); // 0, 0.5, 1, 1.5, ..., 4.5
            }
            randomAccessFile.seek(8*9); // seek I Seek You ICQ OICQ QQ
            System.out.println(randomAccessFile.readDouble()); // EOFException End Of File
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}