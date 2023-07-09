package Programs.Medium.Strings;

import java.util.Scanner;

public class StringPermute {
    static void permute(String input, String answer) {
        if (input.length() == 0) {
            System.out.print(answer + " ");
            return;
        }

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            String left_substr = input.substring(0, i);
            String right_substr = input.substring(i + 1);
            String rest = left_substr + right_substr;
            permute(rest, answer + ch);
        }
    }

    // Driver code
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);

        String s = "ABC";
        String answer = "";

        System.out.print("\nAll possible strings are : ");
        permute(s, answer);
    }
}
// This code is contributed by adityapande88