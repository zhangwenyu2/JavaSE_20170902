import java.util.Scanner;

public class HanoiTower {
    public static void move(int num, String dishA, String dishB){
        System.out.println(dishA+"->"+num+"->"+dishB);
    }
    public static void moveDish(int total, String dishA,String dishB,String dishC){
        if (total==1){
            move(1,dishA,dishC);
        }else{
            move(total-1,dishA,dishB);
            move(1,dishA,dishC);
            move(total-1,dishB,dishC);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入圆盘的个数：");
        int n = scanner.nextInt();
        HanoiTower.moveDish(n, "A", "B", "C");
    }
}