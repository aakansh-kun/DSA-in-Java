package Intermediate.Bit_Manipulation;

//get 3rd bit(position = 2) of a number n
public class bits {
    public static void main(String[] args) {
        int n = 5;
        int pos = 2;
        int bitMast = 1 << pos;
        if ((n & bitMast) == 0) {
            System.out.println("Bit is 0");
        } else {
            System.out.println("Bit is 1");
        }
    }
}
