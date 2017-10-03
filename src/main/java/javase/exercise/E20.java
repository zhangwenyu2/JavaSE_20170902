package javase.exercise;

public class E20 {
    static double u(int n){
        if(n==1){
            return 2;
        }
        if(n==2){
            return 3;
        }else{
            return u(n-1)+u(n-2);
        }
    }

    static double d(int n){
        if(n==1){
            return 1;
        }
        if(n==2){
            return 2;
        }else{
            return d(n-1)+d(n-2);
        }
    }

    public static void main(String[] args) {
        int n=20;
        double counter=0;
        for (int i = 1; i <=n; i++) {
            counter+=u(i)/d(i);
        }
        System.out.println("这个数列前"+n+"项的和是："+counter);
    }
}
