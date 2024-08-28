package task5;

import java.util.Scanner;

public class Question5 {

	public static void main(String[] args) {

		 // Create a Scanner object for input
        Scanner scanner = new Scanner(System.in);
        
        // Prompt the user to enter the mark
        System.out.print("Enter the mark: ");
        int mark = scanner.nextInt();
        
        // Determine the grade based on the mark
        char grade;
        if (mark >= 90 && mark <= 100) {
            grade = 'A'; // Marks between 90 and 100
        } 
        else if (mark >= 80 && mark < 90) {
            grade = 'B'; // Marks between 80 and 89
        } 
        else if (mark >= 70 && mark < 80) {
            grade = 'C'; // Marks between 70 and 79
        } 
        else if (mark >= 60 && mark < 70) {
            grade = 'D'; // Marks between 60 and 69
        } 
        else if (mark >= 50 && mark < 60) {
            grade = 'E'; // Marks between 50 and 59
        } 
        else if (mark < 50) {
            grade = 'F'; // Marks less than 50
        } 
        else {
            System.out.println("Invalid mark entered.");
            scanner.close();
            return; // Exit the program if the mark is not within valid range
        }
        
        // Print the corresponding grade
        System.out.println("The grade is: " + grade);
        
        // Close the scanner
        scanner.close();

	}

}
