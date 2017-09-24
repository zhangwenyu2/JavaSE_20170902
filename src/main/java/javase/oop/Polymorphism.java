package javase.oop;

public class Polymorphism {

    double add(double x, int y) {
        return x + y;
    }

    int add(int a, double b) {
        return a;
    }

    public static void main(String[] args) {
        Polymorphism polymorphism = new Polymorphism();
        System.out.println(polymorphism.add(1, 2d)); // L f d
    }
}