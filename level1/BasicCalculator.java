// Write a program to create a basic calculator that can perform addition, subtraction, multiplication, and division. The program should ask for two numbers (floating point) and perform all the operations
// Hint => 
// Create a variable number1 and number 2 and take user inputs.
// Perform Arithmetic Operations of addition, subtraction, multiplication and division and assign the result to a variable and finally print the result
// I/P => number1, number2
import java.util.*;
public class BasicCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        double number1 = sc.nextDouble();
        System.out.println("Enter the second number: ");
        double number2 = sc.nextDouble();
        // Add
        double add = number1 + number2;

        // Subtract
        double sub = number1 - number2;

        // Multiplication
        double mul = number1 * number2;

        // Division
        double div = number1 / number2;

        System.out.println("Addition: " + add);
        System.out.println("Subtraction: " + sub);
        System.out.println("Multiplication: " + mul);
        System.out.println("Division: " + div);
}}
