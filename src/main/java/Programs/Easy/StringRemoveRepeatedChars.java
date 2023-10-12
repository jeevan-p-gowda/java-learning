package Programs.Easy;

import java.util.LinkedHashSet;
import java.util.Set;

public class StringRemoveRepeatedChars {
    /**Method-1*/
    public static void removeRepeatedChars(String inputString) {
        Set<Character> ls = new LinkedHashSet<>();
        for (int i = 0; i < inputString.length(); i++) {
            ls.add(inputString.charAt(i));
        }
        for (Object value : ls) {
            System.out.print(value);
        }
    }

    /**Method-2*/
    static void method2(String inputString) {
        for (int i = 0; i < inputString.length(); i++) {
            for (int j = i + 1; j < inputString.length(); j++) {
                if (inputString.charAt(i) == inputString.charAt(j)) {
                    System.out.println(inputString.replaceAll(String.valueOf(inputString.charAt(i)), ""));
                }
            }
        }
    }

    public static void main(String[] args) {
        removeRepeatedChars("Jeevan P Gowda");
        method2("Jeevan P ");
    }
}
