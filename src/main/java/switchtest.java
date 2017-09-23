import java.util.Scanner;
public class switchtest {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("input level:");
        String level=scanner.next();
        // String level="E";

        switch(level){
            case "A" :
                System.out.println("85-90");
                break;
            case "B":
                System.out.println("70-85");
                break;
            case "C":
                System.out.println("60-70");
                break;
            case "D":
                System.out.println("0-60");
                break;
            default:
                System.out.println("Error!");
                break;
        }
    }
}
