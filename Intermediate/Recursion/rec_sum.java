package Intermediate.Recursion;

public class rec_sum {
    public static int sum = 0;

    public static void PrintSum(int i, int n) {
        if (i == n) {
            sum += i;
            System.out.println(sum);
            return;
        }
        sum += i;
        PrintSum(i + 1, n);
    }

    public static void main(String[] args) {
        PrintSum(1, 5);
    }
}
