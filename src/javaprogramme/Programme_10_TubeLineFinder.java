/**
 * 10. Write a programme that tells you which line passes through particular stations.
 * Just use Zone 1 stations name.
 */
package javaprogramme;

import java.util.*;

public class Programme_10_TubeLineFinder {

    public static void main(String[] args) {
        zoneOneLine();
    }

    public static void zoneOneLine() {
        // Creating a map of stations and the corresponding tube lines
        Map<String, List<String>> stationLinesMap = new HashMap<>();

        // Adding some example Zone 1 stations and their tube lines
        stationLinesMap.put("Oxford Circus", Arrays.asList("Bakerloo", "Central", "Victoria"));
        stationLinesMap.put("Piccadilly Circus", Arrays.asList("Bakerloo", "Piccadilly"));
        stationLinesMap.put("Covent Garden", Arrays.asList("Piccadilly"));
        stationLinesMap.put("Leicester Square", Arrays.asList("Bakerloo", "Piccadilly"));
        stationLinesMap.put("King's Cross St Pancras", Arrays.asList("Circle", "Hammersmith & City", "Metropolitan", "Northern", "Piccadilly"));
        stationLinesMap.put("Green Park", Arrays.asList("Jubilee", "Piccadilly", "Victoria"));
        stationLinesMap.put("Bond Street", Arrays.asList("Central", "Jubilee"));
        stationLinesMap.put("Charing Cross", Arrays.asList("Bakerloo", "Northern"));

        // Create a scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a station name
        System.out.println("Enter a Zone 1 London Underground station name:");
        String stationName = scanner.nextLine().trim();

        // Check if the station exists in our map and display the lines that serve it
        if (stationLinesMap.containsKey(stationName)) {
            List<String> lines = stationLinesMap.get(stationName);
            System.out.println("The following tube lines pass through " + stationName + ":");
            for (String line : lines) {
                System.out.println(line);
            }
        } else {
            System.out.println("Sorry, we don't have information on that station.");
        }
        scanner.close();   //scanner close
    }
}
