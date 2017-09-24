public class Chinese extends Human {
    //子类自己特有的域
    String hairColor="black";
    String shengXiao;

    //子类有自己特有的方法
    void speakChinese(){

    }


    public static void main(String[] args) {
        Chinese chinese=new Chinese();
        System.out.println(chinese.name);
        chinese.study("Java SE");

        System.out.println(chinese.shengXiao);
        chinese.speakChinese;
    }
}
