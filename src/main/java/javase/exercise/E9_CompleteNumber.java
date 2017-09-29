package javase.exercise;


public class E9_CompleteNumber {
    public static void main(String[] args) {

        for (int i = 2; i <1001 ; i++) {
            int counter=0;
            for (int j = 1; j <i; j++) {
                if(i%j==0){
                    counter+=j;
                }
            }
            if(i==counter){
                System.out.println(i);
            }
        }


    }

}
