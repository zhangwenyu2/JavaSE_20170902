package javase.exercise;

public class E22 {
    static int mul(int n){
        int counter=1;
        if(n>1)
            counter=n*mul(n-1);
        return counter;
        }

    public static void main(String[] args) {
        System.out.println(mul(5));
    }
    }

