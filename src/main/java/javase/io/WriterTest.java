package javase.io;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;


public class WriterTest {
    public static void main(String[] args) {
        Writer writer = null;
        try {
            writer = new FileWriter("test1");
            writer.write("中文");
            writer.flush(); // 刷
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (writer != null) {
                try {
                    writer.close(); // NPE
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}