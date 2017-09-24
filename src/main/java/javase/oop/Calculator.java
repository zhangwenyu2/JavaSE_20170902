package javase.oop;

public class Calculator {
    public double pi=3.1415926;
    private int x;
    private int y;

    private boolean b;

    public boolean isB() {
        return b;
    }

    public void setB(boolean b) {
        this.b = b;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    int divide() {
        m();
        return x / y;
    }

    private void m() {
        System.out.println("...");
    }
}
