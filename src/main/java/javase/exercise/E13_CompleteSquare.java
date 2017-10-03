package javase.exercise;

public class E13_CompleteSquare {
    public static void main(String[] args) {
        for (int i = 1;i<3000; i++) {
            double s1=Math.sqrt(i+100);
            int m=(int)s1;
            double s2=Math.sqrt(i+100+168);
            int n=(int)s2;
            if (((i + 100) == m * m) && ((i + 100 + 168) == n * n)) {
                System.out.println("这个数是"+i);
            }
        }
    }
}
