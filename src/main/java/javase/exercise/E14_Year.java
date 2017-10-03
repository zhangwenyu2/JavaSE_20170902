package javase.exercise;

import java.util.Scanner;

public class E14_Year {
    static int check(int year, int month, int day){
        boolean leapyear=false;
        int counter=0;
        if(year%400==0 || (year%400!=0 && year%4==0)){
            leapyear=true;
        }

        switch(month){
            case 1:counter=day;break;
            case 2:counter=day+31;break;
            case 3:counter=day+59;break;
            case 4:counter=day+90;break;
            case 5:counter=day+120;break;
            case 6:counter=day+151;break;
            case 7:counter=day+181;break;
            case 8:counter=day+212;break;
            case 9:counter=day+243;break;
            case 10:counter=day+273;break;
            case 11:counter=day+304;break;
            case 12:counter=day+334;break;
            default:
                System.out.println("Input Error!");
                break;
        }
        if (leapyear && (month!=1) && (month!=2)){
            counter+=1;
        }
        return counter;
    }


    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("请输入年：");
        int a=scanner.nextInt();
        System.out.println("请输入月：");
        int b=scanner.nextInt();
        System.out.println("请输入日：");
        int c=scanner.nextInt();
        System.out.println(a+"年"+b+"月"+c+"日是这一年的第"+check(a,b,c)+"天。");
    }
}
