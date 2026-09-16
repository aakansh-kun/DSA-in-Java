package Intermediate.Bit_Manipulation;

import java.util.Scanner;

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

        // update the 3rd bit (position = 2) of the number n to (for 0, use and with not
        // and for 1, use or)
        int pos3 = 2;
        int n3 = 5;
        int bitMask3 = 1 << pos3;
        n3 = n3 & ~bitMask3;
        System.out.println("after updating to 0: " + n3);
        n3 = n3 | bitMask3;
        System.out.println("after updating to 1: " + n3);
        // doing together
        System.out.println("Enter the operation: ");
        Scanner sc = new Scanner(System.in);
        int oper = sc.nextInt();
        int n4 = 5;
        int pos4 = 1;
        if (oper == 0) {
            // update to 0
            int bitMask4 = 1 << pos4;
            n4 = n4 & ~bitMask4;
            System.out.println(n4);
        } else {
            // update to 1
            int bitMask4 = 1 << pos4;
            n4 = n4 | bitMask4;
            System.out.println(n4);
        }
        sc.close();
    }
}
