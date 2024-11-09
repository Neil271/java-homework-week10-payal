/**
 * 9. Create a HashMap object called people that will store String keys and Integer
 * values: And use for each loop to iterate the value from Map.
 */
package javaprogramme;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Programme_9_HashMap {

    public static void main(String[] args) {
        hashMapExample();
    }

    public static void hashMapExample() {
        Scanner scanner = new Scanner(System.in);
        HashMap<String, Integer> people = new HashMap<>();

        // Ask the user for the number of entries they want to add
        System.out.print("Enter the number of people you want to add: ");
        int numEntries = scanner.nextInt();
        scanner.nextLine(); // Clear the newline

        // Input entries for the HashMap
        for (int i = 0; i < numEntries; i++) {
            System.out.println("Enter name for person " + (i + 1) + ": ");
            String name = scanner.nextLine();

            System.out.print("Enter age for " + name + ": ");
            int age = scanner.nextInt();
            scanner.nextLine(); // Clear the newline

            // Add the name and age to the HashMap
            people.put(name, age);
        }
        // Use for-each loop to iterate over the entries in the HashMap
        System.out.println("\nPeople in the HashMap:");
        for (Map.Entry<String, Integer> entry : people.entrySet()) {
            System.out.println("Name: " + entry.getKey() + ", Age: " + entry.getValue());
        }
        scanner.close();  //scanner close
    }
}
