/**
 * 7. Write a Java program to test if an array list is empty or not.
 */
package javaprogramme;

import java.util.ArrayList;
import java.util.Scanner;

public class Programme_7_emptyArrayList {

    public static void main(String[] args) {
        checkArrayListEmpty();
    }

    public static void checkArrayListEmpty() {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> items = new ArrayList<>();

        // Ask the user if they want to add items to the list
        System.out.print("Do you want to add items to the list? (Y/N): ");
        char choice = scanner.next().toUpperCase().charAt(0);
        scanner.nextLine(); // Clear the newline

        if (choice == 'Y') {
            System.out.print("Enter the number of items you want to add: ");
            int numItems = scanner.nextInt();
            scanner.nextLine(); // Clear the newline

            // Add items to the ArrayList
            System.out.println("Enter the items:");
            for (int i = 0; i < numItems; i++) {
                System.out.print("Item " + (i + 1) + ": ");
                String item = scanner.nextLine();
                items.add(item);
            }
        }

        // Check if the ArrayList is empty
        if (items.isEmpty()) {
            System.out.println("\nThe ArrayList is empty.");
        } else {
            System.out.println("\nThe ArrayList is not empty. Here are the items:");
            for (String item : items) {
                System.out.println(item);
            }
        }

        scanner.close();   //scanner close
    }
}
