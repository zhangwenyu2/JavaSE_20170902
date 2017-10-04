package javase.exercise;


import java.util.Random;
import java.util.Scanner;


public class Add_E1 {
    public static void main(String[] args) {

        //生成6个不重复的中奖号码
        Random random=new Random();
        int a1=random.nextInt(16);
        int a2=random.nextInt(16);
        while(a1==a2){
            a2=random.nextInt(16);
        }
        int a3=random.nextInt(16);
        while(a3==a1 || a3==a2){
            a3=random.nextInt(16);
        }
        int a4=random.nextInt(16);
        while(a4==a3 || a4==a2 || a4==a1){
            a4=random.nextInt(16);
        }
        int a5=random.nextInt(16);
        while(a5==a4 || a5==a3 ||a5==a2 ||a5==a1){
            a5=random.nextInt(16);
        }
        int a6=random.nextInt(16);
        while(a6==a5 || a6==a4 ||a6==a3 ||a6==a2 || a6==a1){
            a6=random.nextInt(16);
        }
        System.out.println(a1);
        System.out.println(a2);
        System.out.println(a3);
        System.out.println(a4);
        System.out.println(a5);
        System.out.println(a6);

        //键盘录入号码
        Scanner scanner=new Scanner(System.in);
        System.out.println("请输入6个[0-15]之间的数字：");
        int a=scanner.nextInt();
        int b=scanner.nextInt();
        int c=scanner.nextInt();
        int d=scanner.nextInt();
        int e=scanner.nextInt();
        int f=scanner.nextInt();

       //判断输入号码是否中奖
        int counter=0;
        if(a==a1 || a==a2 ||a==a3 || a==a4 || a==a5 ||a==a6){ counter++; }
        if(b==a1 || b==a2 ||b==a3 || b==a4 || b==a5 ||b==a6){ counter++; }
        if(c==a1 || c==a2 ||c==a3 || c==a4 || c==a5 ||c==a6){ counter++; }
        if(d==a1 || d==a2 ||d==a3 || d==a4 || d==a5 ||d==a6){ counter++; }
        if(e==a1 || e==a2 ||e==a3 || e==a4 || e==a5 ||e==a6){ counter++; }
        if(f==a1 || f==a2 ||f==a3 || f==a4 || f==a5 ||f==a6){ counter++; }

        switch(counter){
            case 6:
                System.out.println("您的号码为"+a+"\t"+b+"\t"+c+"\t"+d+"\t"+e+"\t"+f+",中了特等奖");
                break;
            case 5:
                System.out.println("您的号码为"+a+"\t"+b+"\t"+c+"\t"+d+"\t"+e+"\t"+f+",中了一等奖");
                break;
            case 4:
                System.out.println("您的号码为"+a+"\t"+b+"\t"+c+"\t"+d+"\t"+e+"\t"+f+",中了二等奖");
                break;
            case 3:
                System.out.println("您的号码为"+a+"\t"+b+"\t"+c+"\t"+d+"\t"+e+"\t"+f+",中了三等奖");
                break;
            default:
                System.out.println("您的号码为"+a+"\t"+b+"\t"+c+"\t"+d+"\t"+e+"\t"+f+",没有中奖");
                break;
        }

    }
}

