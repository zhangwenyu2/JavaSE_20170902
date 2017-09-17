public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("HelloJava");

        boolean a=true;
        byte b=12;
        char c='b';
        short d=250;
        int e=1000;
        long f=20000;
        float g=3.2f;
        double z=5.9794;

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);
        System.out.println(g);
        System.out.println(z);

        long y=2147473648L;
        System.out.println(y);

        char c1='\377';
        System.out.println(c1);
        char c2='\u9fbb';
        System.out.println(c2);

        String s1=null;
        System.out.println(s1);

        System.out.println("3"+1+2);
        System.out.println(1+2+"3");
    }
}
