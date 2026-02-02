package Recursion;

import java.util.Scanner;

public class KthSymbolInGrammar {
    static int kthSymbol(int n, int k) {
        // Base case
        if (n == 1) {
            return 0;
        }

        // Find parent
        int parent = kthSymbol(n - 1, k / 2);

        // If k is even, same as parent
        if (k % 2 == 0) {
            return parent;
        }
        // If k is odd, flip parent
        else {
            return parent == 0 ? 1 : 0;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // row
        int k = sc.nextInt(); // index (0-based)

        System.out.println(kthSymbol(n, k));
        sc.close();
    }
}

