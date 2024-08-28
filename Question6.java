package task5;

import java.util.Scanner;

public class Question6 {

	public static void main(String[] args) {
		
		  // Create a Scanner object for input
        Scanner scanner = new Scanner(System.in);
        
        // Input month
        System.out.print("Enter the month (1 for January, 2 for February, ..., 12 for December): ");
        int month = scanner.nextInt();
        
        // Input room rent per day
        System.out.print("Enter the room rent per day: ");
        float roomRentPerDay = scanner.nextFloat();
        
        // Input number of days stayed
        System.out.print("Enter the number of days stayed: ");
        int numberOfDays = scanner.nextInt();
        
        // Calculate the base total cost
        float totalCost = roomRentPerDay * numberOfDays;
        
        // Determine if it's peak season and apply the surcharge
        switch (month) {
            case 4: // April
            case 5: // May
            case 6: // June
            case 11: // November
            case 12: // December
                totalCost *= 1.20; // 20% surcharge
                break;
            default:
                // No surcharge for other months
                break;
        }
        
        // Print the total tariff
        System.out.printf("The total tariff is: %.2f%n", totalCost);
        
        // Close the scanner
        scanner.close();
	}

}
