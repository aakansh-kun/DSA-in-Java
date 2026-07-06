import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int num = sc.nextInt();
        fib(num);
        sc.close();
    }

    public static void fib(int n) {
        if (n < 1) {
            System.out.println("Invalid Input");
        }
        int a = 0;
        int b = 1;
        System.out.print(a + " ");
        System.out.print(b + " ");
        int c;
        for (int i = 2; i < n; i++) {
            c = a + b;
            System.out.print(c + " ");
            a = b;
            b = c;
        }
    }
}
