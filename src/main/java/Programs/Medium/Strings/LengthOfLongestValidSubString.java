package Programs.Medium.Strings;

import java.util.Stack;

public class LengthOfLongestValidSubString {
    public static int getLengthOfLongestValidSubString(String input) {
        int n = input.length();

        // Create a stack and push -1
        // as initial index to it.
        Stack<Integer> stk = new Stack<>();
        stk.push(-1);

        // Initialize result
        int result = 0;

        // Traverse all characters of given string
        for (int i = 0; i < n; i++) {
            // If opening bracket, push index of it
            if (input.charAt(i) == '(')
                stk.push(i);

                // // If closing bracket, i.e.,str[i] = ')'
            else {
                // Pop the previous
                // opening bracket's index
                if (!stk.empty())
                    stk.pop();

                // Check if this length
                // formed with base of
                // current valid substring
                // is more than max
                // so far
                if (!stk.empty()) {
                    result = Math.max(result, i - stk.peek());
                }

                // If stack is empty. push
                // current index as base
                // for next valid substring (if any)
                else
                    stk.push(i);
            }
        }
        return result;
    }

    // Driver code
    public static void main(String[] args) {
        String str = "((()()";
        String str1 = "()";

        // Function call
        System.out.println(getLengthOfLongestValidSubString(str1));

        str = "()(()))))";

        // Function call
        System.out.println(getLengthOfLongestValidSubString(str));
    }
}

