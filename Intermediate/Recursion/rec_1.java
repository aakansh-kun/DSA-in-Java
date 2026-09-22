package Intermediate.Recursion;

import java.util.*;

public class rec_1 {
    public static void printNumb(int n) {
        if (n == 0) {
            return;
        }
        System.out.print(n + " ");
        printNumb(n - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = sc.nextInt();
        printNumb(n);
        sc.close();
    }
}
