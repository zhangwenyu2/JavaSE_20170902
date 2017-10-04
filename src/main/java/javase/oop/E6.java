package javase.oop;

public class E6 {
    String color;
    String series;

    public E6(){
        this.color="red";
        this.series="car";
    }

    public E6(String color, String series){
        this.color=color;
        this.series=series;
    }

    void outputcolor(){
        System.out.println(color);
    }

    void outputseries(){
        System.out.println(series);
    }

    public static void main(String[] args) {
        E6 without_p=new E6();
        without_p.outputcolor();
        without_p.outputseries();

        E6 with_p=new E6("Black","Car");
        with_p.outputcolor();
        with_p.outputseries();
    }
}
