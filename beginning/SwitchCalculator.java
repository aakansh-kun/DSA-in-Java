import java.util.Scanner;

class SwitchCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("--- Java Switch Case Calculator ---");
        
        // 1. Take the first number
        System.out.print("Enter first number: ");
        double num1 = scanner.nextDouble();
        
        // 2. Take the operator
        System.out.print("Enter an operator (+, -, *, /): ");
        char operator = scanner.next().charAt(0); // Reads the first character of input
        
        // 3. Take the second number
        System.out.print("Enter second number: ");
        double num2 = scanner.nextDouble();
        
        double result;
        
        // 4. Switch case based on the operator character
        switch (operator) {
            case '+':
                result = num1 + num2;
                System.out.println("Result: " + num1 + " + " + num2 + " = " + result);
                break;
                
            case '-':
                result = num1 - num2;
                System.out.println("Result: " + num1 + " - " + num2 + " = " + result);
                break;
                
            case '*':
                result = num1 * num2;
                System.out.println("Result: " + num1 + " * " + num2 + " = " + result);
                break;
                
            case '/':
                // Quick check to avoid division by zero error
                if (num2 != 0) {
                    result = num1 / num2;
                    System.out.println("Result: " + num1 + " / " + num2 + " = " + result);
                } else {
                    System.out.println("Error: Division by zero is not allowed.");
                }
                break;
                
            default:
                System.out.println("Error: Invalid operator entered.");
                break;
        }
        
        scanner.close();
    }
}