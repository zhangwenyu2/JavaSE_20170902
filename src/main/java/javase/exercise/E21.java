package javase.exercise;

public class E21 {
    static int Mul(int n){
        int m=1;
        for (int i =n; i>=1; i--) {
            m*=i;
        }
        return m;
    }

    public static void main(String[] args) {
        int counter=0;
        int n=20;
        for (int i = 1; i <=n ; i++) {
            counter+=Mul(i);
        }
        System.out.println(counter);
    }
}
