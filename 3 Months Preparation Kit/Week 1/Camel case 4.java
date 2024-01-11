// I'm close to you. Look around you carefully.

import java.util.Scanner;

public class CamelCaseConverter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            String[] parts = line.split(";");
            String operation = parts[0];
            String type = parts[1];
            String input = parts[2];

            if ("S".equals(operation)) {
                System.out.println(splitCamelCase(input));
            } else if ("C".equals(operation)) {
                System.out.println(combineWords(input, type));
            }
        }

        scanner.close();
    }

    private static String splitCamelCase(String str) {
        str = str.replace("()", "");

        String[] words = str.split("(?=[A-Z])");
        StringBuilder result = new StringBuilder();

        for (String word : words) {
            if (result.length() > 0) {
                result.append(" ");
            }
            result.append(word.toLowerCase());
        }

        return result.toString();
    }

    private static String combineWords(String words, String type) {
        StringBuilder camelCase = new StringBuilder();
        boolean nextUpperCase = false;

        for (String word : words.split(" ")) {
            if (nextUpperCase || "C".equals(type)) {
                camelCase.append(word.substring(0, 1).toUpperCase()).append(word.substring(1).toLowerCase());
            } else {
                camelCase.append(word.toLowerCase());
            }
            nextUpperCase = true;
        }

        if ("M".equals(type)) {
            camelCase.append("()");
        }

        return camelCase.toString();
    }
}
