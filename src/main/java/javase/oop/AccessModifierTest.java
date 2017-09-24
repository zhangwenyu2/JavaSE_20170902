package javase.oop;

public class AccessModifierTest {

    // public 公有
    // private 私有
    // protected 保护
    // default 缺省

    private int i;
    protected double d;
    boolean b;
    public String s;

    private void m1() {
        i = 0;
        System.out.println(i);
    }

    protected void m2() {

    }

    void m3() {

    }

    public void m4() {

    }
}