package javase.exercise;

import java.util.Scanner;

public class E15_Turn {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Please input x：");
        int x=scanner.nextInt();
        System.out.println("Please input y:");
        int y=scanner.nextInt();
        System.out.println("Please input z:");
        int z=scanner.nextInt();

        int temp;
        if(x>y){
            temp=x;x=y;y=temp;
        }
        if(x>z){
            temp=x;x=z;z=temp;
        }
        if(y>z){
            temp=y;y=z;z=temp;
        }

        System.out.println("x,y,z从小到大输出依次为：");
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
    }
    

}
