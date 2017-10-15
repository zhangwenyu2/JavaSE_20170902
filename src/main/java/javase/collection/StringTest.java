package javase.collection;

public class StringTest {
    public static void main(String[] args) {
        String s = "  hello hello";  //直接量方式赋值
        System.out.println(s);

        String s1 = new String();

        System.out.println(s.charAt(2));

        String s2 = s.concat(" Billy!");
        System.out.println(s2);

        boolean a = s.contains("m");
        System.out.println(a);

        boolean b = s.endsWith("llo");
        System.out.println(b);

        boolean c = s.equals("HELLO");
        System.out.println(c);

        boolean d = s.equalsIgnoreCase("HELLO");
        System.out.println(d);

        System.out.println(s.getBytes());

        System.out.println(s.indexOf("llo"));

        System.out.println(s.isEmpty());

        System.out.println(s.lastIndexOf('l'));

        System.out.println(s.matches("hello"));

        String e=s.replace('o','M');
        System.out.println(e);

        String f=s.replaceAll("llo","M");
        System.out.println(f);

        String g=s.replaceFirst("llo","M");
        System.out.println(g);

        System.out.println(s.split("o"));

        System.out.println(s.startsWith("e",1));

        System.out.println(s.substring(2,10));

        System.out.println(s.toCharArray());

        System.out.println(s.toLowerCase());
        System.out.println(s.toUpperCase());
        System.out.println(s.trim());

        System.out.println(s.valueOf('e'));

        for (String s8 : s.split("")) {
            System.out.println(s8);
        }


        String ss="123";
        int i=Integer.parseInt(ss);
        System.out.println(i);


        String s4 = "hi";
        String s5 = "hi";
        String s6 = new String("hi");

        System.out.println(s4 == s5);
        System.out.println(s4 == s6);
    }
}