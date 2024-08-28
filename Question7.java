package task5;

import java.util.Scanner;

public class Question7 {

	public static void main(String[] args) {
		
		   // Create a Scanner object for input
        Scanner scanner = new Scanner(System.in);
        
        // Input three numbers
        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();
        
        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();
        
        System.out.print("Enter the third number: ");
        int num3 = scanner.nextInt();
        
        // Initialize the greatest number with the first number
        int greatest = num1;
        
        // Compare the second number with the current greatest number
        if (num2 > greatest) {
            greatest = num2;
        }
        
        // Compare the third number with the current greatest number
        if (num3 > greatest) {
            greatest = num3;
        }
        
        // Print the greatest number
        System.out.println("The greatest number is: " + greatest);
        
        // Close the scanner
        scanner.close();
	}

}
