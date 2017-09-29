package javase.exercise;

import java.util.Scanner;

public class E6_MaxandMin {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("input m:");
        int m=scanner.nextInt();
        System.out.println("input n(n>m):");
        int n=scanner.nextInt();
        int mul=m*n;
        while(n%m!=0){
            int temp=n%m;
            n=m;
            m=temp;
        }
        System.out.println("the common divisor of m and n is:"+m);
        System.out.println("the common multiple of m and n is:"+mul/m);
    }
}
