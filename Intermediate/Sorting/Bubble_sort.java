package Intermediate.Sorting;

public class Bubble_sort {
    public static void main(String[] args) {
        int arr[] = { 5, 4, 1, 3, 2 };
        int n = arr.length;
        // traverse
        for (int i = 0; i < n - 1; i++) {
            // traverse
            for (int j = 0; j < n - 1 - i; j++) { // time complexity O(n^2)
                if (arr[j] > arr[j + 1]) {
                    // swap
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        // print sorted array
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
