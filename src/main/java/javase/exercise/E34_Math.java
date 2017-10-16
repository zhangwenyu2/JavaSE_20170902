package javase.exercise;

import java.util.Hashtable;

public class E34_Math {
    public static void main(String[] args) {
        int[] ints=new int[10000];
        String k="";
        int[] counters=new int[20];
        int sum=0;
        Hashtable<String,Integer> hashtable = new Hashtable<>();

        long start=System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            ints[i]=(int)(Math.random()*21);
            while(ints[i]==0){
                ints[i]=(int)(Math.random()*21);
            }
            k=String.valueOf(i);
            hashtable.put(k,ints[i]);
        }
        long end=System.currentTimeMillis();

        System.out.println(end-start);
        for (Integer integer : hashtable.values()) {
            switch (integer){
                case 1:counters[0]++;continue;
                case 2:counters[1]++;continue;
                case 3:counters[2]++;continue;
                case 4:counters[3]++;continue;
                case 5:counters[4]++;continue;
                case 6:counters[5]++;continue;
                case 7:counters[6]++;continue;
                case 8:counters[7]++;continue;
                case 9:counters[8]++;continue;
                case 10:counters[9]++;continue;
                case 11:counters[10]++;continue;
                case 12:counters[11]++;continue;
                case 13:counters[12]++;continue;
                case 14:counters[13]++;continue;
                case 15:counters[14]++;continue;
                case 16:counters[15]++;continue;
                case 17:counters[16]++;continue;
                case 18:counters[17]++;continue;
                case 19:counters[18]++;continue;
                case 20:counters[19]++;continue;

            }
        }
        System.out.println("1出现的次数是："+counters[0]);
        System.out.println("2出现的次数是："+counters[1]);
        System.out.println("3出现的次数是："+counters[2]);
        System.out.println("4出现的次数是："+counters[3]);
        System.out.println("5出现的次数是："+counters[4]);
        System.out.println("6出现的次数是："+counters[5]);
        System.out.println("7出现的次数是："+counters[6]);
        System.out.println("8出现的次数是："+counters[7]);
        System.out.println("9出现的次数是："+counters[8]);
        System.out.println("10出现的次数是："+counters[9]);
        System.out.println("11出现的次数是："+counters[10]);
        System.out.println("12出现的次数是："+counters[11]);
        System.out.println("13出现的次数是："+counters[12]);
        System.out.println("14出现的次数是："+counters[13]);
        System.out.println("15出现的次数是："+counters[14]);
        System.out.println("16出现的次数是："+counters[15]);
        System.out.println("17出现的次数是："+counters[16]);
        System.out.println("18出现的次数是："+counters[17]);
        System.out.println("19出现的次数是："+counters[18]);
        System.out.println("20出现的次数是："+counters[19]);
        for (int i = 0; i < 20; i++) {
            sum+=counters[i];
        }
        System.out.println(sum);
    }
}
