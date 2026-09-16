package Intermediate.Bit_Manipulation;

//get 3rd bit(position = 2) of a number n (perform and)
public class bits {
    public static void main(String[] args) {
        int n = 5;
        int pos = 2;
        int bitMask = 1 << pos;
        if ((n & bitMask) == 0) {
            System.out.println("Bit is 0");
        } else {
            System.out.println("Bit is 1");
        }

        // set 2nd bit (position = 1) of number n (perform or)
        int pos1 = 1;
        int bitMask1 = 1 << pos1;
        n = n | bitMask1;
        System.out.println(n);

        // clear 3rd bit (position = 2) of number n (perform and not)
        int n2 = 5;
        int pos2 = 2;
        int bitMask2 = 1 << pos2;
        n2 = n2 & ~bitMask2;
        System.out.println(n2);
    }
}
