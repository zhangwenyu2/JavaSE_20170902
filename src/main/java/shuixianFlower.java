public class shuixianFlower {
    public static void main(String[] args) {
        for (int i = 100; i <1000 ; i++) {
            int g=i%10; // 对10求模
            int s=i/10%10;
            int b=i/100;
            if(i==(g*g*g+s*s*s+b*b*b)){
                System.out.println(i);
            }

        }
    }
}
