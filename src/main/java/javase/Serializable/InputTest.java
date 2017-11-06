package javase.Serializable;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;


public class InputTest {
    public static void main(String[] args) {
        try (ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("user"))) {
            User user = (User) objectInputStream.readObject();
            System.out.println(user);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}