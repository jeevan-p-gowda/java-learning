package Programs.Medium.Strings;

import java.util.LinkedHashMap;
import java.util.Map;

public class FirstNonRepeatingChar {
    public static char findFirstNonRepeatingChar(String word) {
        Map<Character, Integer> charCount = new LinkedHashMap<>();

        // Count the frequency of each character while maintaining order
        for (char c : word.toCharArray()) {
            charCount.put(c, charCount.getOrDefault(c, 0) + 1);
        }

        // Find the first non-repeating character
        for (Map.Entry<Character, Integer> entry : charCount.entrySet()) {
            if (entry.getValue() == 1) {
                return entry.getKey();
            }
        }

        // Return a sentinel value if there is no non-repeating character
        return '\0';
    }

    public static void main(String[] args) {
        String word = "testmediums";
        char firstNonRepeating = findFirstNonRepeatingChar(word);

        if (firstNonRepeating != '\0') {
            System.out.println("First Non-Repeating Character: " + firstNonRepeating);
        } else {
            System.out.println("No non-repeating character found.");
        }
    }
}
