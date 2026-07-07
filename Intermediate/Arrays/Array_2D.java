import java.util.*;

class Array_2D {
    public static void main(String[] args) {
        // int[][] arr = { { 1, 2 }, { 4, 5 }, { 7, 8 } }; //type 1
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[3][2];
        System.out.println("Enter the elements of the array");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println("The array is:");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}
