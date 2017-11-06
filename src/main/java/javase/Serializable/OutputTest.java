package javase.Serializable;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;


public class OutputTest {
    public static void main(String[] args) {
        User user = new User(1, "Tom", 1.75, true);
        try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("user"))) {
            objectOutputStream.writeObject(user);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}