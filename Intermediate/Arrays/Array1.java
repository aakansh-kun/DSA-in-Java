import java.util.*;

class Array1 {
    public static void main(String[] args) {
        // int[] marks = { 1, 2, 3, 4, 5 }; // type 1
        // int[] marks = new int[10]; //type 2
        // marks[0] = 90;
        // marks[1] = 78;
        // marks[2] = 99;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of array");
        int n = sc.nextInt();
        int[] marks = new int[n];
        System.out.println("enter the Marks: ");
        for (int i = 0; i < n; i++) {
            marks[i] = sc.nextInt();
        }
        System.out.println("enter the value of marks you want to search");
        int target = sc.nextInt();
        for (int i = 0; i < marks.length; i++) {
            if (marks[i] == target) {
                System.out.println("Marks found at index " + i);
                break;
            }
        }
        sc.close();
    }
}
