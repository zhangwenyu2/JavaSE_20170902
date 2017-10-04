package javase.oop;


public class E2_Cube {

    //fields
    private double length;
    private double width;
    private double height;


    public E2_Cube(double length,double width,double height){
        this.length=length;
        this.width=width;
        this.height=height;
    }


    //methods

    double Volume(){
        return length*width*height;

    }

    public static void main(String[] args) {
        E2_Cube cube=new E2_Cube(4,2.5,3);
        System.out.println("这个立方体的体积是："+cube.Volume());
    }
}
