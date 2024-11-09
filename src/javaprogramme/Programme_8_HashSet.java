/**
 * 8. Use a HashSet that stores Integer Objects. Store the number 4, 7 and 8 to Sets.
 * Show which numbers between 1 and 10 are in the set. (Hint: use for loop and if
 * else)
 */
package javaprogramme;

import java.util.HashSet;
import java.util.Scanner;

public class Programme_8_HashSet {

    public static void main(String[] args) {
        hashsetExample();
    }

    public static void hashsetExample() {
        Scanner scanner = new Scanner(System.in);
        HashSet<Integer> numbersSet = new HashSet<>();

        // Adding predefined numbers to the HashSet
        numbersSet.add(4);
        numbersSet.add(9);
        numbersSet.add(1);

        // Display message for numbers in the set between 1 and 10
        System.out.println("Checking numbers between 1 and 10 in the set:");

        // Loop from 1 to 10 and check if each number is in the HashSet
        for (int i = 1; i <= 10; i++) {
            if (numbersSet.contains(i)) {
                System.out.println(i + " is in the set.");
            } else {
                System.out.println(i + " is not in the set.");
            }
        }
        scanner.close();  //scanner close
    }
}
