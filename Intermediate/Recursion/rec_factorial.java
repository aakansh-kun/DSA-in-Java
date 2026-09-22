package Intermediate.Recursion;

public class rec_factorial {
    public static int printFactorial(int n) {
        if (n == 1 || n == 0) {
            return 1;
        }
        return n * printFactorial(n - 1);
    }

    public static void main(String[] args) {
        System.out.println(printFactorial(5));
    }

}
