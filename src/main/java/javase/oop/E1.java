package javase.oop;

import java.util.Scanner;

public class E1 {

    //判断闰年的方法
    void isLeapYear(int n){
        if(n%400==0 || (n%400!=0 &&n%4==0)){
            boolean leapyear=true;
            System.out.println(n+"年是闰年");
        }else{
            boolean leapyear=false;
            System.out.println(n+"年不是闰年");
        }

    }


    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("请输入年份：");
        int n=scanner.nextInt();
        E1 leap=new E1();
        leap.isLeapYear(n);
    }
}
