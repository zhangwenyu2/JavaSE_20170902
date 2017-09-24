// class = fields + methods
public class Human {

    // fields
    String name;
    int age;
    char gender;
    double height;
    double weight;
    boolean married;

    Human() { // default constructor

    }

    public Human(String name) {
        this.name = name;
    }

    public Human(String name, int age, char gender, double height, double weight, boolean married) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.height = height;
        this.weight = weight;
        this.married = married;
    }

    // methods
    String study(String book) {
        System.out.println(name + " read " + book);
        return "homework...";
    }

    void work(int hours, String device) {
        System.out.println(name + " work " + hours + " hours, with " + device);
    }

    int walk() {
        // ...
        return 100;
    }

    public static void main(String[] args) {
        Human tom = new Human("Tom", 18, 'M', 1.7, 60, false); // object instance
        // .
        System.out.println(tom.name);
        System.out.println(tom.age);
        System.out.println(tom.gender);
        System.out.println(tom.height);
        System.out.println(tom.married);

        System.out.println(tom.study("Java SE"));
        tom.study("Head first Java");
        tom.work(8, "computer");

        Human jerry = new Human("Jerry");
        tom.work(1,"mobile phone");
    }
}