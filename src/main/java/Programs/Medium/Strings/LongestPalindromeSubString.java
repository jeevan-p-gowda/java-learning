package Programs.Medium.Strings;

public class LongestPalindromeSubString {
    /*static String getLongestPalindromeSubString(String input) {
        char[] inputChar = input.toCharArray();
        int stringLength = input.length();
        int dp[][] = new int[stringLength][];
        int maxLength = 0;
        String answer = " ";

        for (int diff = 0; diff < stringLength; diff++) {
            for (int i = 0, j = i + diff; j < stringLength; i++, j++) {
                if (i == j) {
                    dp[i][j] = 1;
                } else if (diff == 1) {
                    dp[i][j] = input.charAt(i) == input.charAt(j) ? 2 : 0;
                } else {
                    if ((input.charAt(i) == input.charAt(j)) && (dp[i + 1][j - 1])) {
                        dp[i][j] = dp[i + 1][j - 1] + 2;
                    }
                }
                if ((dp[i][j])) {
                    if (j - i + 1 > maxLength) {
                        maxLength = j - i + 1;
                        answer = input.substring(i, maxLength);
                    }
                }
            }
        }
        return answer;
    }

     public static void main(String[] args) {
        getLongestPalindromeSubString("aabaa");
    }*/
}

