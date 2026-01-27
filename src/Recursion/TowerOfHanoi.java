package Recursion;

import java.util.Scanner;

public class TowerOfHanoi {
    static void toh(int n, char src, char dest, char temp) {
        if (n == 0) {
            return;
        }
        // Step 1: move n-1 from src to temp via dest
        toh(n - 1, src, temp, dest);

        // Step 2: move nth from src to dest
        System.out.println(src + " -> " + dest);

        // Step 3: move n-1 from temp to dest via src
        toh(n - 1, temp, dest, src);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();   // enter N
        toh(n, 'S', 'D', 'T');  // move from A to C via B
    }
}
