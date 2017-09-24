public class Chinese extends Human {
    //子类自己特有的域
    String hairColor="black";
    String shengXiao;

    //子类有自己特有的方法
    void speakChinese(){

    }

    public Chinese(String name){
        super(name);
    }

    public Chinese(String name, int age, char gender, double height, double weight, boolean married, String shengXiao){
        super(name,age, gender,height,weight, married);
        this.shengXiao=shengXiao;
    }

    public static void main(String[] args) {
        Chinese chinese=new Chinese("Zhangwenyu", 18,'F',1.8,52.5,false,"Monkey");
        System.out.println(chinese.name);  //子类调用父类的域
        chinese.study("Java SE");   //子类调用父类的方法

        System.out.println(chinese.shengXiao);
        chinese.speakChinese();
        System.out.println(chinese.hairColor);

        Human Lisi=new Chinese("Lisi");  //用父类声明一个对象，用子类的构造方法，
                                                //这个对象是父类也是子类的一个实例。

        System.out.println(chinese instanceof Human);
        System.out.println(Lisi instanceof Human);
        System.out.println(Lisi instanceof Chinese);



    }
}
