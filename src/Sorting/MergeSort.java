package Sorting;

import java.util.Scanner;

public class MergeSort {
    public static void mergeSort(int A[], int left, int right) {
        if (left >= right) {
            return;
        }
        int mid = left + (right - left) / 2;

        mergeSort(A, left, mid);

        mergeSort(A, mid+1, right);

        merge(A, left, mid, right);
    }
    private static void merge (int A[], int left, int mid, int right) {
        int size = right - left + 1;
        int[] temp = new int[size];

        int i = left;
        int j = mid + 1;
        int k = 0;

        while (i <= mid && j <= right) {
            if (A[i] <= A[j]) {
                temp[k++] = A[i++];
            } else  {
                temp[k++] = A[j++];
            }
        }
        while (i <= mid) {
            temp[k++] = A[i++];
        }
        while (j <= right) {
            temp[k++] = A[j++];
        }
        for (int x = 0; x < size; x++) {
            A[left+x] = temp[x];
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        mergeSort(arr, 0, n - 1);

        // Print sorted array
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

        sc.close();
    }
}
