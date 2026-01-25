package Recursion;

import java.util.Scanner;

public class RecursionNotesPractise {

    static long sumN (int n) {
        if(n<=0) return 0;
        if (n == 1) return 1;
        return sumN(n-1) + n;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(sumN(n));
    }
}
