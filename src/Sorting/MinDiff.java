package Sorting;

import java.util.Arrays;
import java.util.Scanner;

public class MinDiff {
    public static int minDiff(int [] packets, int students) {
        int n = packets.length;
        if (n == 0 || students == 0 || n < students) return 0;

        Arrays.sort(packets);

        int minDifference = Integer.MAX_VALUE;

        for (int i = 0; i+students-1 < n; i++) {
            int minInWindow = packets[i];
            int maxInWindow =  packets[i+students-1];
            int diff = maxInWindow - minInWindow;
            if (diff < minDifference) minDifference = diff;
        }
        return minDifference;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] packets = new int[n];
        for (int i = 0; i < n; i++) {
            packets[i] = sc.nextInt();
        }

        int students = sc.nextInt();

        int result = minDiff(packets, students);
        System.out.println(result);

        sc.close();
    }
}
