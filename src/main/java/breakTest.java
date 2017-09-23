public class breakTest {
    public static void main(String[] args) {
        test: //label
        for (int i = 0; i < 10; i++) {
            for(int j=0;i<10;j++) {
                if (j==5) {
                    break test;
                }
                System.out.print(i*j+"\t");
            }


        }
    }
}
