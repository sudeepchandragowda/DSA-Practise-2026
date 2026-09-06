package BitManipulation;

import java.util.Scanner;

public class SingleNumberII {
    public static int bitCountingApproach(int[] arr) {
        int ans = 0;
        for (int bitPosition = 0; bitPosition < 32; bitPosition++) {
            int count = 0;
            for (int num : arr) {
                if ((num & (1 << bitPosition)) != 0) count++;
            }
            if (count % 3 != 0) ans |= (1 << bitPosition);
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter " + n + " integers:");
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();

        System.out.println("Bit counting: " + bitCountingApproach(arr));

        sc.close();
    }
}