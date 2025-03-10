package Calculator;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a 4-digit number
        System.out.print("Enter a 4-digit number: ");
        int inputNumber = scanner.nextInt();

        // Check if the input has exactly 4 digits
        if (inputNumber < 1000 || inputNumber > 9999) {
            System.out.println("Error: Input must have exactly 4 digits!!!");
        } else {
            // Prompt the user to enter a math operator
            System.out.print("Enter an operator: ");
            char operator = scanner.next().charAt(0);

            // Separate the input number into two 2-digit numbers
            int num1 = inputNumber / 100;
            int num2 = inputNumber % 100;

            // Check for division by zero
            if (operator == '/' && num2 == 0) {
                System.out.println("Error: Invalid operator for the given number!!!");
            } else {
                int result = 0;

                // Perform the calculation based on the operator
                switch (operator) {
                    case '+':
                        result = num1 + num2;
                        break;
                    case '-':
                        result = num1 - num2;
                        break;
                    case '*':
                        result = num1 * num2;
                        break;
                    case '/':
                        result = (int) num1 / num2;
                        break;
                    default:
                        System.out.println("Error: Invalid operator.");
                        return;
                }

                // Print the equation and result
                System.out.println("Result: " + num1 + " " + operator + " " + num2 + " = " + result);
            }
        }
    }
}
