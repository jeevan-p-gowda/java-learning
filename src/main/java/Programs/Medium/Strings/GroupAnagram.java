package Programs.Medium.Strings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GroupAnagram {
    public static List<List<String>> groupAnagrams(String[] words) {
        Map<String, List<String>> anagramMap = new HashMap<>();

        for (String word : words) {
            // Convert the word to a character array, sort it, and convert it back to a string
            char[] charArray = word.toCharArray();
            Arrays.sort(charArray);
            String sortedWord = new String(charArray);

            // Add the word to the corresponding anagram group
            if (!anagramMap.containsKey(sortedWord)) {
                anagramMap.put(sortedWord, new ArrayList<>());
            }
            anagramMap.get(sortedWord).add(word);
        }

        return new ArrayList<>(anagramMap.values());
    }

    public static void main(String[] args) {
        String[] words = {"cat", "dog", "tac", "god", "act"};

        List<List<String>> result = groupAnagrams(words);
        System.out.println(result);
    }
}
