package javase.exercise;

public class E16_Mulitiply {
    public static void main(String[] args) {
        for (int i = 1; i <10 ; i++) {
            for (int j = 1; j <=i ; j++) {
                if(j<i){
                    System.out.print(j+"*"+i+"="+j*i+"\t");
                }
                if(j==i){
                    System.out.print(j+"*"+i+"="+j*i+"\n");
                    break;
                }

            }
        }
    }
}
