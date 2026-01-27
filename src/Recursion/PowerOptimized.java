package Recursion;

import java.util.Scanner;

public class PowerOptimized {
    static int power(int a, int n) {
        if (n == 0)
            return 1;
        int half = power(a, n / 2);
        if (n % 2 == 0)
            return half * half;
        else
            return half * half * a;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int n = sc.nextInt();

        System.out.println(power(a, n));
    }
}