package javase.oop;

public class Chinese extends Human {

    String hairColor = "black";
    String shengXiao;

    public Chinese(String name) {
        super(name);
    }

    public Chinese(String name, int age, char gender, double height, double weight, boolean married, String shengXiao) {
        super(name, age, gender, height, weight, married);
        this.shengXiao = shengXiao;
    }

    void speakChinese() {

    }

    void eat(String food) { // overwrite 重写  override 覆盖
        System.out.println("吃、" + food);
    }

    int walk(int i) {

        return 1;
    }

    public static void main(String[] args) {
        Chinese chinese = new Chinese("Zhangsan", 18, 'M', 1.7, 70, false, "Tiger");
        System.out.println(chinese.name); // null ""
        System.out.println(chinese.shengXiao);
        System.out.println(chinese.hairColor);
        chinese.study("Java SE");

        chinese.eat("米饭");

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
