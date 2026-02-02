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

/*
2️⃣ K-th Symbol in Grammar — Thinking Process

How we approached it:

We observed that each row is generated from the previous row.

Instead of generating full rows, we traced the parent of the required symbol.

Each symbol at position k in row n comes from position k/2 in row n-1.

We reduced the problem until we reached row 1.

Decision at each level was based on:

Even index → same as parent

Odd index → flipped value

We used recursion to move backwards, not forwards.

Key learning:

Instead of building the answer, trace where the answer comes from.
 */