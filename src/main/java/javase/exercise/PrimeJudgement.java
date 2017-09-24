package javase.exercise;

public class PrimeJudgement {
    public static void main(String[] args) {
        int counter=0;
        for (int i = 101; i < 201; i++) {
            boolean isPrime=true;
            for (int j = 2; j < i/2+1; j++) {
                if (i % j == 0) {
                    isPrime=false;
                    break;
                }
            }
            if(isPrime){
                counter++;
                System.out.println(i);
            }
        }
        System.out.println("counter:"+counter);
    }
}
