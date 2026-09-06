package BitManipulation;

import java.util.*;

public class CountSetBits {
    public static int countSetBits(int n) {
        int count = 0;
        while (n > 0) {
            n = n & (n - 1);
            count++;
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter N: ");
        int n = sc.nextInt();

        System.out.println("Binary: " + Integer.toBinaryString(n));
        System.out.println("Kernighan:   " + countSetBits(n));

        sc.close();
    }
}
