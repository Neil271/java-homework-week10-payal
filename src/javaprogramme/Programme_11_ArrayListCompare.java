/**
 * 11. Declare following two arrylist and compare it.
 * <p>
 * ArrayList<String> c1= new ArrayList<String>();
 * c1.add("Red");
 * c1.add("Green");
 * c1.add("Black");
 * c1.add("White");
 * c1.add("Pink");
 * ArrayList<String> c2= new ArrayList<String>();
 * c2.add("Red");
 * c2.add("Green");
 * c2.add("Black");
 * c2.add("Pink");
 */
package javaprogramme;

import java.util.ArrayList;

public class Programme_11_ArrayListCompare {

    public static void main(String[] args) {
        compareArrayList();
    }

    public static void compareArrayList() {
        // Declare and initialize two ArrayLists
        ArrayList<String> c1 = new ArrayList<String>();
        c1.add("Red");
        c1.add("Green");
        c1.add("Black");
        c1.add("White");
        c1.add("Pink");

        ArrayList<String> c2 = new ArrayList<String>();
        c2.add("Red");
        c2.add("Green");
        c2.add("Black");
        c2.add("Pink");

        // Compare the lists using equals() method (checks both size and order)
        if (c1.equals(c2)) {
            System.out.println("The two lists are equal.");
        } else {
            System.out.println("The two lists are NOT equal.");
        }
    }
}
