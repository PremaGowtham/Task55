package task5;

import java.util.Scanner;

public class Question2 {

	public static void main(String[] args) {


	      // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a string
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Call the function to reverse the string
        String reversedString = reverseString(input);

        // Output the reversed string
        System.out.println("Reversed string: " + reversedString);

        // Close the scanner
        scanner.close();
    }

    // Function to reverse a string
    public static String reverseString(String str) {
        String reversed = ""; // Initialize an empty string to store the reversed result

        // Loop through the string from the end to the beginning
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed += str.charAt(i); // Append each character to the reversed string
        }

        return reversed; // Return the reversed string
    }

	

}
