package Programs.Medium.Strings;

public class ShortestCommonSuperSequence {
    int getLengthOfSCS(String s1, String s2, int m, int n) {
        int fullLength = m + n;
        int lcs = getLengthOfLCS(s1, s2, m, n);
        return (fullLength-lcs);
    }

    int getLengthOfLCS(String X, String Y, int m, int n) {
        int L[][] = new int[m + 1][n + 1];

        for (int i = 0; i <= m; i++) {
            for (int j = 0; j <= n; j++) {
                if (i == 0 || j == 0)
                    L[i][j] = 0;
                else if (X.charAt(i - 1) == Y.charAt(j - 1))
                    L[i][j] = L[i - 1][j - 1] + 1;
                else
                    L[i][j] = Math.max(L[i - 1][j], L[i][j - 1]);
            }
        }
        return L[m][n];
    }

    public static void main(String[] args) {
        ShortestCommonSuperSequence scs = new ShortestCommonSuperSequence();
        String s1 = "AGGTAB";
        String s2 = "GXTXAYB";

        int m = s1.length();
        int n = s2.length();

        System.out.println("Length of LCS is" + " " +
                scs.getLengthOfSCS(s1, s2, m, n));
    }
}