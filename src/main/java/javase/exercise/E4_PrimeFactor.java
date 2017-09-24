package javase.exercise;

import java.util.Scanner;


public class E4_PrimeFactor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("input m:");
        int m = scanner.nextInt();
        int i=2; //定义最小的素数；
        String str=m+"=";
        int counter=0;

        while(i<=m){
            if(m%i == 0){
                if(counter==0){
                    str+=i;
                    m=m/i;
                    i=2;
                    counter++;
                }else{
                    str+="*"+i;
                    m=m/i;
                    i=2;
                }
            }else{
                i++;
            }
        }
        System.out.println(str);
    }
}