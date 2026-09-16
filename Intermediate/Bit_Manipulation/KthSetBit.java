package Intermediate.Bit_Manipulation;

public class KthSetBit {
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

    // Checks if the Kth bit (0-indexed from the right) is set
    public static boolean checkKthBit(int n, int k) {
        return (n & (1 << k)) != 0;
    }

    public static void main(String[] args) {
        int n = 10;
        
        System.out.print(n + " in binary is (printed LSB to MSB): ");
        binary(n);
        
        System.out.println("Number of set bits in " + n + " is: " + CountSetBit(n));
        
        // Let's check if the 1st and 3rd bit of 10 (binary: 1010) are set 
        // Note: bits are 0-indexed from right to left -> [3rd: 1, 2nd: 0, 1st: 1, 0th: 0]
        int k1 = 1;
        int k2 = 3;
        System.out.println("Is the " + k1 + "th bit set in " + n + "? " + checkKthBit(n, k1));
        System.out.println("Is the " + k2 + "th bit set in " + n + "? " + checkKthBit(n, k2));
    }
}
