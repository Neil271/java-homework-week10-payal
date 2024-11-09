/**
 * 5. Write a Java program to iterate through all elements in an array list using
 * Iterater.
 */
package javaprogramme;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Programme_5_ArrayListIterator {

    public static void main(String[] args) {
        Programme_5_ArrayListIterator arrayIterator = new Programme_5_ArrayListIterator();
        arrayIterator.iteratorArrayList();
    }

    public void iteratorArrayList() {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> items = new ArrayList<>();

        // Ask the user how many items they want to add
        System.out.print("Enter the number of items you want to add: ");
        int numItems = scanner.nextInt();
        scanner.nextLine(); // Clear the newline

        // Add items to the ArrayList
        System.out.println("Enter the items:");

        for (int i = 0; i < numItems; i++) {
            System.out.println("Item" + (i + 1) + ": ");
            String item = scanner.nextLine();
            items.add(item);
        }

        // Iterate through the ArrayList using an Iterator
        System.out.println("\nThe items in the list are:");
        Iterator<String> iterator = items.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        scanner.close(); //scanner close
    }
}
