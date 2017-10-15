package javase.collection;

public class StringVsStringBuffer {

    private static final String ALPHABET = "abcdefghijklmnopqrstuvwxyz";

    public static void main(String[] args) {

        String s = "";

        StringBuffer stringBuffer = new StringBuffer();

        long start = System.currentTimeMillis(); // 1970.1.1 - current
        for (int i = 0; i < 10000; i++) {
//            s += ALPHABET;
            stringBuffer.append(ALPHABET);
        }
        long end = System.currentTimeMillis();

        System.out.println(end - start);

        System.out.println(stringBuffer.length()); // ?
    }
}
