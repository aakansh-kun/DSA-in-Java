package Intermediate.Bit_Manipulation;

public class NthSetBit {
    public static void binary(int n) {
        for (int i = n; i > 0; i /= 2) {
            System.out.print(i % 2 + "");
        }
        System.out.println();
    }

    public static int CountSetBit(int n) {
        int count = 0;
        while (n > 0) {
            if ((n & 1) != 0) {
                count++;
            }
            n >>= 1;
        }
        return count;
    }

    public static void main(String[] args) {
        int n = 10;
        System.out.println(n + " in binary is: ");
        binary(n);
        System.out.println("Number of set bits in " + n + " is: " + CountSetBit(n));
    }
}
