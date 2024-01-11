// I'm close to you. Look around you carefully.

import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

public class StringFrequency {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfStrings = scanner.nextInt();
        scanner.nextLine(); // Move to the next line
        String[] strings = new String[numberOfStrings];
        for (int i = 0; i < numberOfStrings; i++) {
            strings[i] = scanner.nextLine();
        }

        int numberOfQueries = scanner.nextInt();
        scanner.nextLine(); // Move to the next line
        String[] queries = new String[numberOfQueries];
        for (int i = 0; i < numberOfQueries; i++) {
            queries[i] = scanner.nextLine();
        }

        int[] results = matchingStrings(strings, queries);
        for (int result : results) {
            System.out.println(result);
        }

        scanner.close();
    }

    public static int[] matchingStrings(String[] strings, String[] queries) {
        Map<String, Integer> frequencyMap = new HashMap<>();

        for (String string : strings) {
            frequencyMap.put(string, frequencyMap.getOrDefault(string, 0) + 1);
        }

        int[] result = new int[queries.length];

        for (int i = 0; i < queries.length; i++) {
            result[i] = frequencyMap.getOrDefault(queries[i], 0);
        }

        return result;
    }
}
