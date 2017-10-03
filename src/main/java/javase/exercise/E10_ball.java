package javase.exercise;

public class E10_ball {
    static double height(int n){
        if(n==1){
            return 50;
        }else{
            return 0.5*height(n-1);
        }
    }

    public static void main(String[] args) {
        double total=0;
        int n=2;
        for (int i = 1; i <=n; i++) {
            if(i==1){
                total=100;
            }else{
                total+=2*height(i-1);
            }
        }
        System.out.println("第"+n+"次落地时共经过"+total+"米");
        System.out.println("第"+n+"次反弹"+height(n)+"米");

    }
}

