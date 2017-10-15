package javase.collection;

public class StringBufferTest {
    public static void main(String[] args) {
        StringBuffer stringBuffer=new StringBuffer("hello");
        String s=stringBuffer.toString();
        System.out.println(s);

        String s1="hi";
        StringBuffer stringBuffer1=new StringBuffer(s1);

        System.out.println(stringBuffer1.append(123).append(true));
        System.out.println(stringBuffer1.delete(2, 5));
        System.out.println(stringBuffer1.insert(2, 123)); // offset 抵消\ ['ɒfset]
        System.out.println(stringBuffer1.reverse()); // 反向\ [rɪ'vɜːs]
        stringBuffer1.setCharAt(1, 'a');
        System.out.println(stringBuffer1);
    }

}
