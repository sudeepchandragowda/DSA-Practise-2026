package Sorting;

public class Main {

    private static void swap(int [] a, int i, int j) {
        int t = a[i];
        a[i] = a [j];
        a[j] = t;
    }

    private static void printArray(int [] a) {
        for (int i =0; i< a.length; i++) {
            if (i>0) System.out.print(" ");
            System.out.print(a[i]);
        }
        System.out.println();
    }
    public static void selectionSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i<n; i++) {
            int minIdx = i;
            for (int j = i+1; j < n; j++) {
                if (arr[j] <arr[minIdx]) minIdx = j;
            }
            swap(arr, i, minIdx);
        }
    }
}
