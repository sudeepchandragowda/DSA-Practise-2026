package Sorting;

import java.util.Arrays;
import java.util.Scanner;

public class UniqueElements {
    public static long minUniqueSteps(int[] A) {
        int n = A.length;
        Arrays.sort(A);

        long steps = 0;
        long prev = A[0];

        for (int i = 1; i < n; i++) {
            long curr = A[i];

            if (curr <= prev) {
                long needed = prev + 1;
                steps += (needed - curr);
                prev = needed;
            } else {
                prev = curr;
            }
        }
        return steps;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int [] a = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        System.out.println(minUniqueSteps(a));
        sc.close();
    }
}
