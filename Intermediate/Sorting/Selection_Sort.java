package Intermediate.Sorting;

public class Selection_Sort {
    public static void main(String[] args) {
        int arr[] = { 5, 4, 1, 3, 2 };
        int n = arr.length;
        // traverse
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            // traverse
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            // swap
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
        // print sorted array
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
