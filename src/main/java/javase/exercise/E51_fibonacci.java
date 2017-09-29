package javase.exercise;

import java.util.Scanner;

//斐波那契数列：0、1、1、2、3、5、8，求f(n);
public class E51_fibonacci {

    static int f(int n) {
        if(n==0 || n==1){
            return n;
        }else{
            return f(n-1)+f(n-2) ;
        }

    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("input n:");
        int n=scanner.nextInt();
        System.out.println(f(n));
    }
}