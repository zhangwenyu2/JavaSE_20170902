package javase.oop;

public class E3_Human {
    private String name;
    private String sex;
    private int age;
    private double height;
    private double weight;


    public E3_Human(String name,String sex,int age){
        this.name=name;
        this.sex=sex;
        this.age=age;
    }


    public static void main(String[] args) {
        E3_Human human=new E3_Human("ZhangWenyu","Female",25);
        System.out.println(human.name);
        System.out.println(human.sex);
        System.out.println(human.age);
    }
}
