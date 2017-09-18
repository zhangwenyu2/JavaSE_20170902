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

        long y1=2147473648L;
        System.out.println(y1);

        char c1='\377';
        System.out.println(c1);
        char c2='\u9fbb';
        System.out.println(c2);

        String s1=null;
        System.out.println(s1);

        System.out.println("3"+1+2);
        System.out.println(1+2+"3");

        char a1='A';
        int a2=65;
        boolean s2=a1!=a2;
        System.out.println(s2);

        int x=1;
        int y=0;
        boolean z1=(x>y)||(x++==y);
        System.out.println(z1);
        System.out.println(x);

        boolean m=true;
        m &=false;
        System.out.println(m); //布尔类型得到的依旧是布尔类型

        int n=1;
        n &=1;
        System.out.println(n); //按位与得到的也是相应形式

        int l=-1;
        int z2=l>>>1;
        int z3=l>>1;

        System.out.println(z2);
        System.out.println(z3);

    }
}
