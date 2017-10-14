package javase.oop;

public abstract class Shape {
    public abstract double getArea();
    public abstract double getPerimeter();

}

class Square extends Shape{
    private double length;

    public Square(double length) {
        this.length = length;
    }

    @Override
    public double getArea() {
        return length*length;
    }

    @Override
    public double getPerimeter() {
        return length*4;
    }
}

class Circle extends Shape{
private double radius;
@Override
public double getArea() {
        return Math.PI *radius *radius;
        }

@Override
public double getPerimeter() {
        return Math.PI *radius*2;
        }
}

class Rectangle extends Shape{
    private double width;
    private double height;

    @Override
    public double getArea() {
        return width*height;
    }

    @Override
    public double getPerimeter() {
        return 2*(height+width);
    }
}

class Triangle extends Shape{
    private double a;
    private double b;
    private double c;

    public Triangle(double a, double b, double c) {
        if(!((a+b)>c && (a+c)>b && (b+c)>a)) {
            System.out.println("ERROR!");
            System.exit(0);
        }
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public double getArea() {
        double s=getPerimeter()/2;
        return Math.sqrt(s*(s-a)*(s-b)*(s-c)); //海伦公式
    }

    @Override
    public double getPerimeter() {
        return a+b+c;
    }
}

class ShapeTest{
    public static void main(String[] args) {
        Square square=new Square(1.2);
        System.out.println(square.getArea());
        System.out.println(square.getPerimeter());

        Triangle triangle=new Triangle(1,4,5);
        System.out.println(triangle.getArea());
        System.out.println(triangle.getPerimeter());
    }
}
