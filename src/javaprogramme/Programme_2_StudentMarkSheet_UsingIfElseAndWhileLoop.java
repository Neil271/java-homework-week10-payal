/**
 * /**
 * * 2. Rewrite the student mark sheet programme (From java-homework-week3
 * * programmes) using if else and while loop.
 */
package javaprogramme;

import java.util.Scanner;

public class Programme_2_StudentMarkSheet_UsingIfElseAndWhileLoop {

    public static void main(String[] args) {
        markSheet();
    }

    public static void markSheet() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            // Input Student Name and Roll Number
            System.out.print("Enter Student Name: ");
            String name = scanner.nextLine();

            System.out.print("Enter Roll Number: ");
            String rollNumber = scanner.nextLine();

            // Input and Validate Marks for Each Subject
            int mathMarks = getValidatedMarks(scanner, "Math");
            int scienceMarks = getValidatedMarks(scanner, "Science");
            int englishMarks = getValidatedMarks(scanner, "English");

            // Calculate Total and Percentage
            int totalMarks = mathMarks + scienceMarks + englishMarks;
            double percentage = (totalMarks / 3.0);
            String result = percentage >= 35 ? "Pass" : "Fail";

            // Determine Grade Based on Percentage
            String grade;
            if (percentage >= 80) {
                grade = "A+";
            } else if (percentage >= 60) {
                grade = "A";
            } else if (percentage >= 50) {
                grade = "B";
            } else if (percentage >= 35) {
                grade = "C";
            } else {
                grade = "N/A";
            }

            // Print Mark Sheet

            System.out.println("-------------------------------");
            System.out.println("|         Mark Sheet          |");
            System.out.println("|-----------------------------|");
            System.out.println("|   Name        :   " + name + "      |");
            System.out.println("|   Roll No     :   " + rollNumber + "        |");
            System.out.println("|-----------------------------|");
            System.out.println("|   Subject         Marks     |");
            System.out.println("|-----------------------------|");
            System.out.println("|   Math        :   " + mathMarks + "        |");
            System.out.println("|   Science     :   " + scienceMarks + "        |");
            System.out.println("|   English     :   " + englishMarks + "        |");
            System.out.println("|-----------------------------|");
            System.out.println("|   Total       :   " + totalMarks + "       |");
            System.out.println("|-----------------------------|");
            System.out.println("|   Percentage  :   " + String.format("%.2f", percentage) + "%" + "        |");
            System.out.println("|   Result      :   " + result + "      |");
            System.out.println("|   Grade       :   " + grade + "        |");

            System.out.println("-------------------------------");


            // Ask if the user wants to enter another student
            System.out.print("Would you like to enter another student's marks? (Y/N): ");
            char choice = scanner.next().toUpperCase().charAt(0);
            scanner.nextLine(); // Clear the newline character

            if (choice != 'Y') {
                break;
            }
        }

        System.out.println("Program terminated.");
        scanner.close();
    }

    // Method to get validated marks for a subject
    private static int getValidatedMarks(Scanner scanner, String subjectName) {
        int marks;
        while (true) {
            System.out.print("Enter marks for " + subjectName + " (0-100): ");
            marks = scanner.nextInt();
            if (marks >= 0 && marks <= 100) {
                break;
            } else {
                System.out.println("Invalid Input, Marks should be between 0 and 100");
            }
        }
        return marks;
    }
}


