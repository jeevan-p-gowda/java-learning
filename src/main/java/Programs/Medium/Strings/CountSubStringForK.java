package Programs.Medium.Strings;

import java.util.HashMap;

public class CountSubStringForK {
    static int getCountOfSubStringForK(String input, int distinctCount) {
        if (input.length() == 0) {
            return 0;
        }
        HashMap<Character, Integer> map = new HashMap<>();
        int countOfSubString = 0, leftPointer = 0;

        for (int rightPointer = 0; rightPointer < input.length(); rightPointer++) {
            map.put(input.charAt(rightPointer), map.getOrDefault(input.charAt(rightPointer), 0) + 1);
            while (map.size() > distinctCount) {
                map.put(input.charAt(leftPointer), map.getOrDefault(input.charAt(leftPointer), 0) - 1);
                if (map.get(input.charAt(leftPointer)) == 0) {
                    map.remove(input.charAt(leftPointer));
                }
                leftPointer++;
            }
            countOfSubString += rightPointer - leftPointer + 1;
        }
        return countOfSubString;
    }

    static int getExactCountOfSubStringForK(String input, int distinctCount) {
        return getCountOfSubStringForK(input, distinctCount) - getCountOfSubStringForK(input, distinctCount - 1);
    }

    public static void main(String[] args) {
        String s1 = "pqpqs";
        int k = 2;
        System.out.println("Total substrings with exactly "
                + k + " distinct characters : "
                + getExactCountOfSubStringForK(s1, k));

        String s2 = "aba";
        k = 2;
        System.out.println("Total substrings of " + s2 + " with exactly "
                + k + " distinct characters : "
                + getCountOfSubStringForK(s2, k));
    }
}