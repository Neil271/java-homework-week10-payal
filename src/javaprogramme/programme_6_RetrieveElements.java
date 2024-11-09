/**
 * 6. Write a Java program to retrieve an element (at a specified index) from a given
 * array list
 */
package javaprogramme;

import java.util.ArrayList;
import java.util.Scanner;

public class programme_6_RetrieveElements {

    public static void main(String[] args) {
        elements();
    }

    public static void elements() {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> items = new ArrayList<>();

        // Ask the user how many items they want to add
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
        // Display the list for reference
        System.out.println("\nThe items in the list are: " + items);

        // Ask the user for the index of the element to retrieve
        System.out.print("Enter the index of the item you want to retrieve (0 to " + (items.size() - 1) + "): ");
        int index = scanner.nextInt();

        // Retrieve and display the element at the specified index, if valid
        if (index >= 0 && index < items.size()) {
            String retrievedItem = items.get(index);
            System.out.println("Element at index " + index + " is: " + retrievedItem);
        } else {
            System.out.println("Invalid index. Please enter an index between 0 and " + (items.size() - 1) + ".");
        }

        scanner.close();  //scanner close
    }

}
