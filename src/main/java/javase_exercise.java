public class javase_exercise {
    public static void main(String[] args) {
        float b=101.1415f;
        long c=123456789L;
        char d='\u9FAA';
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);

        int m=(int)b;   //强制类型转换
        System.out.println(m);
        char n=(char)m;
        System.out.println(n);
    }
}
