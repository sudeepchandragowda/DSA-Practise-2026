package Recursion;

import java.util.*;

public class GrayCode {
    static List<Integer> grayCode(int n) {
        // Base case
        if (n==1) {
            List<Integer> base = new ArrayList<>();
            base.add(0);
            base.add(1);
            return base;
        }
        List<Integer> prev = grayCode(n-1);
        List<Integer> result = new ArrayList<>();

        // First half: prefix 0 (same values)
        for (int x : prev) {
            result.add(x);
        }
        int addBit = 1<<(n-1);
        for (int i = prev.size()-1; i >= 0; i--) {
            result.add(prev.get(i) + addBit);
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        List<Integer> ans = grayCode(n);
        for (int x : ans) {
            System.out.print(x + " ");
        }
        sc.close();
    }
}

/*
3️⃣ Gray Code — Thinking Process

How we approached it:

We observed that Gray code of n bits can be built from Gray code of n-1 bits.

We followed a strict pattern:

Generate Gray code for n-1

Prefix 0 to all values (no change numerically)

Reverse the list

Prefix 1 to all values (add 2^(n-1))

Reversing is crucial to ensure consecutive numbers differ by only one bit.

We stored values as integers instead of strings for simplicity.

Key learning:

Large recursive sequences are built by reusing smaller valid sequences.
 */