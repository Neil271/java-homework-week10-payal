/**
 * 3. Write a Java program to reverse an array of integer values.
 */
package javaprogramme;

import java.util.Scanner;

public class Programme_3_ReverseArray {

    public void reverseArray() {

        // Ask the user for the size of the array
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();

        // Create an array of the given size
        int[] array = new int[n];

        // Input elements for the array
        System.out.println("Enter " + n + " integer values:");
        for (int i = 0; i < n; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }
        scanner.close(); //scanner close

        // Display the original array
        System.out.println("Original Array:");
        for (int i = 0; i <= array.length - 1; i++) {
            System.out.print(array[i] + " ");
        }

        System.out.println(" ");

        // Display the reversed array
        System.out.println("Reverse Array");
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.println(array[i] + " ");
        }
    }

    public static void main(String[] args) {
        Programme_3_ReverseArray arrayReverse = new Programme_3_ReverseArray();
        arrayReverse.reverseArray();
    }

}
