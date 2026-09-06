package BitManipulation;

import java.util.*;

public class SingleNumber {
    public static int singleNumber(int[] arr) {
        int ans = 0;
        for (int num : arr) {
            ans ^= num;
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array:");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter the elements in the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Single number in the array is = " + singleNumber(arr));
    }
}
