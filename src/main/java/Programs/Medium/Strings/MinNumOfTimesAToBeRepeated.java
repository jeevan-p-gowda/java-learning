package Programs.Medium.Strings;

public class MinNumOfTimesAToBeRepeated {
    /*package whatever //do not write package name here */
    static int repeatedStringMatch(String A, String B) {
        int m = A.length();
        int n = B.length();

        int count;
        boolean found = false;

        for (int i = 0; i < m; ++i) {
            int j = i;

            int k = 0;

            count = 1;

            while (k < n && A.charAt(j) == B.charAt(k)) {

                if (k == n - 1) {
                    found = true;
                    break;
                }

                j = (j + 1) % m;

                // if j = 0, it means we have repeated the
                // string
                if (j == 0)
                    ++count;

                k += 1;
            }
            if (found)
                return count;
        }
        return -1;
    }

    public static void main(String[] args) {

        String A = "abcd", B = "cdabcdab";

        // Function call
        System.out.println(repeatedStringMatch(A, B));
    }
}