 import java.util.Scanner;

public class NumberClassifierMenu {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char userChoice; // Declare userChoice

        do {
            // Display menu
            System.out.println("\n=== Number Classifier Menu ===");
            System.out.println("1. Classify a number as positive, negative, or zero");
            System.out.println("2. Print a multiplication table for a given number");
            System.out.println("3. Exit");
            System.out.print("Enter your choice (1-3): ");
            
            int choice = input.nextInt(); // Read user's choice

            switch (choice) {
                case 1:
                    System.out.print("Enter a number to classify: ");
                    int number = input.nextInt();

                    // Classify the number
                    if (number > 0) {
                        System.out.println("The number " + number + " is positive.");
                    } else if (number < 0) {
                        System.out.println("The number " + number + " is negative.");
                    } else {
                        System.out.println("The number is zero.");
                    }

                    // Check if the number is even or odd
                    if (number % 2 == 0) {
                        System.out.println("It is also an even number.");
                    } else {
                        System.out.println("It is an odd number.");
                    }
                    break;

                case 2:
                    System.out.print("Enter a number to display its multiplication table: ");
                    int tableNumber = input.nextInt();
                    System.out.println("Multiplication Table for " + tableNumber + ":");

                    // Generate multiplication table
                    for (int i = 1; i <= 10; i++) {
                        System.out.println(tableNumber + " x " + i + " = " + (tableNumber * i));
                    }
                    break;

                case 3:
                    System.out.println("Exiting the program. Goodbye!");
                    input.close();
                    return; // Exit the program

                default:
                    System.out.println("Invalid option. Please choose between 1 and 3.");
            }

            // Ask user if they want to return to the menu
            System.out.print("Do you want to return to the menu? (Y/N): ");
            userChoice = input.next().toUpperCase().charAt(0); // Read user input

        } while (userChoice == 'Y'); // Continue if 'Y'

        System.out.println("Program ended.");
        input.close(); // Close scanner after loop ends
    }
}
