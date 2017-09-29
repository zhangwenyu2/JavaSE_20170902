package javase.exercise;

import java.util.Scanner;

public class E52_HaoniTower {

    private static int counter = 0;

    static void hanoi(int n, char src, char with, char dest) {
        if (n == 1) {
            System.out.println(src + "\t->\t" + dest);
            counter++;
        } else {
            hanoi(n - 1, src, dest, with);
            System.out.println(src + "\t->\t" + dest);
            counter++;
            hanoi(n - 1, with, src, dest);
        }

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("input n: ");
        int n = scanner.nextInt();

        hanoi(n, 'A', 'B', 'C');
        System.out.println("counter: " + counter);
    }
}