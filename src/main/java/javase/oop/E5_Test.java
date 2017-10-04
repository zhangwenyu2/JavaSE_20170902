package javase.oop;

public class E5_Test {
    public static void main(String[] args) {
        E5_Student info=new E5_Student();
        info.setName("ZhangWenyu");
        info.setScore(96.5);
        info.setStudent_Number("15020442");

        System.out.println(info.getName());
        System.out.println(info.getScore());
        System.out.println(info.getStudent_Number());
    }
}
