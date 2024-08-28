package task5;

import java.util.Scanner;

public class Question1 {

	public static void main(String[] args) {
		
		 // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a string
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Convert the input to lowercase to ensure the check is case-insensitive
        input = input.toLowerCase();

        // Call the function to check if the string is a palindrome
        if (isPalindrome(input)) {
            System.out.println("\"" + input + "\" is a palindrome.");
        } else {
            System.out.println("\"" + input + "\" is not a palindrome.");
        }

        // Close the scanner
        scanner.close();
    }

    // Function to check if a string is a palindrome
    public static boolean isPalindrome(String str) {
        int length = str.length();

        // Loop through the string from both ends towards the center
        for (int i = 0; i < length / 2; i++) {
            // Compare characters from the beginning and end
            if (str.charAt(i) != str.charAt(length - 1 - i)) {
                return false; // Not a palindrome
            }
        }

        return true; // Is a palindrome
    }
	

}
