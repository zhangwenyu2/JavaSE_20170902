package javase.oop;

public class PassArguments {

    public static void main(String[] args) {
        Foo f = new Foo("f");
        changeReference(f); // It won't change the reference!
        System.out.println(f.getAttribute()); // f

        modifyReference(f); // It will modify the object that the reference variable "f" refers to!
        System.out.println(f.getAttribute()); // c
    }

    public static void changeReference(Foo a) {
        Foo b = new Foo("b");
        a = b;
    }

    public static void modifyReference(Foo c) {
        c.setAttribute("c");
    }
}

class Foo {
    private String attribute;

    public Foo(String attribute) {
        this.attribute = attribute;
    }

    public void setAttribute(String attribute) {
        this.attribute = attribute;
    }

    public String getAttribute() {
        return attribute;
    }
}