package javase.oop;

public class E4_pi {
    public double pi=3.1415926;
    double radius;

    public E4_pi(double radius){
        this.radius=radius;
    }

    double area(){

        return pi*radius*radius;
    }


    public static void main(String[] args) {
        E4_pi square=new E4_pi(3);
        System.out.println("这个圆的面积是："+square.area());
    }
}
