/**
 * 4. Write a Java program to create a new array list, add some colours (string) and
 * printout the collection using for each loop.
 */
package javaprogramme;

import java.util.ArrayList;
import java.util.Scanner;

public class Programme_4_ColorList {

    public static void main(String[] args) {
        Programme_4_ColorList list = new Programme_4_ColorList();
        list.printColors();
    }

    public void printColors() {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> colors = new ArrayList<>();

        // Ask the user how many colors they want to add
        System.out.println("Enter the number of colors you want to add:");
        int numColors = scanner.nextInt();
        scanner.nextLine(); //Clear the newline

        // Add colors to the ArrayList
        System.out.println("Enter the colors:");
        for (int i = 0; i < numColors; i++) {
            System.out.println("Color " + (i + 1) + ": ");
            String color = scanner.nextLine();
            colors.add(color);
        }

        // Print out the colors using a for-each loop
        System.out.println("\nThe colors in the list are:");
        for (String color : colors) {
            System.out.println(color);
        }

        scanner.close(); //close the scanner
    }
}
