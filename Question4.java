package task5;

import java.util.Scanner;

public class Question4 {

	public static void main(String[] args) {

		System.out.println("Enter the number");
		
         Scanner scanner = new Scanner(System.in);
        
        // Read the input number
        int n = scanner.nextInt();
        
        System.out.println("Output");
        
   
        for (int i = 0; i < n; i++) {
        
            for (int j = 0; j < n; j++) {
                // Print '*' if it's on the diagonal or anti-diagonal, else print a space
                if (i == j || i + j == n - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }


            System.out.println();
        }


        scanner.close();
	}

}
