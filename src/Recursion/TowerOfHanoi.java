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


/*
1️⃣ Tower of Hanoi — Thinking Process

How we approached it:

We defined the recursive function to mean:
        “Move n disks from Source to Destination using Temporary.”

We trusted recursion to correctly handle smaller subproblems.

To move n disks:

First move n-1 disks from Source → Temporary

Move the largest disk from Source → Destination

Move n-1 disks from Temporary → Destination

We did not manually manage order — the problem constraints guarantee correctness.

Printing happens only after a recursive call finishes, not when it starts.

Key learning:

Recursion works because smaller problems are always solved correctly before bigger ones.
 */