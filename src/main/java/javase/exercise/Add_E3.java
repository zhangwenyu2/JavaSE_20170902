package javase.exercise;

import java.util.Random;
import java.util.Scanner;

public class Add_E3 {
    public static void main(String[] args) {
        //生成一个数字
        Random random=new Random();
        int n=random.nextInt(101);
        while(n==0){
            n=random.nextInt(101);
        }
        System.out.println(n);


        //Guess process
        int counter=0;
        String s="\t";
        do{
            counter++;
            Scanner scanner=new Scanner(System.in);
            System.out.println("Please input a number:");
            int m=scanner.nextInt();

            if(m==n){
                System.out.println("猜数正确");
                break;
            }
            if(m>n){
                System.out.println("猜大了，请重新猜");
                s+=m+"\t";
                continue;
            }
            if(m<n){
                System.out.println("猜小了，请重新猜");
                s+=m+"\t";
                continue;
            }

        }while(counter<6);
        if(counter==6){
            System.out.println(s);
        }
    }
}
