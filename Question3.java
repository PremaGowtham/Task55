package task5;

import java.util.Scanner;

public class Question3{

	public static void main(String[] args) {
		
		System.out.println("Enter the number");

		// Create a Scanner object for input
        Scanner scanner = new Scanner(System.in);
        
        // Read the input number
        int n = scanner.nextInt();
        
        // Variable to keep track of the current number
        int currentNumber = 1;
        
        System.out.println("Output");
        
        // Loop through each row
        for (int i = 1; i <= n; i++) {
            // Loop through each column in the current row
            for (int j = 1; j <= i; j++) {
            	
            	
                // Print the current number followed by a space
                System.out.print(currentNumber + " ");
                
                // Increment the current number
                currentNumber++;
            }
            


            System.out.println();
        }
        


        scanner.close();
	}

}
