package Intermediate.Strings;

public class string1 {
    public static void main(String[] args) {
        String s1 = "Hello";
        String s2 = "World";

        // Concatenation
        String s3 = s1 + " " + s2;
        System.out.println(s3);

        // Length
        System.out.println(s3.length());

        // Character access
        System.out.println(s3.charAt(0));

        // Check if strings are equal
        System.out.println(s1.equals(s2));

        // Convert to uppercase
        System.out.println(s3.toUpperCase());

        // Convert to lowercase
        System.out.println(s3.toLowerCase());

        // Print in reverse order
        for (int i = s3.length() - 1; i >= 0; i--) {
            System.out.print(s3.charAt(i));
        }
    }
}
