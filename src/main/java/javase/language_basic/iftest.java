package javase.language_basic;//Exercise Five 利用条件运算符的嵌套完成成绩登记的判断。
import java.util.Scanner;
public class iftest {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("input int score:");
        int score=scanner.nextInt();
        char result=  (score>=90)?'A':((score>=60)?'B':'C');
        System.out.println(result);
    }

}
