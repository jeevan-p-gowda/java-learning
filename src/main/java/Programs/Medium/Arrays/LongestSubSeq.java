package Programs.Medium.Arrays;

public class LongestSubSeq {
    // Java program to find length of
// longest subsegment of all 1's
// by changing at most k 0's

static int longestSubSeg(int a[], int n, int k) {
        int cnt0 = 0;
        int l = 0;
        int max_len = 0;

        // i decides current ending point
        for (int i = 0; i < n; i++) {
            if (a[i] == 0)
                cnt0++;

            // If there are more 0's move
            // left point for current ending
            // point.
            while (cnt0 > k) {
                if (a[l] == 0)
                    cnt0--;
                l++;
            }

            max_len = Math.max(max_len, i - l + 1);
        }
        return max_len;
    }

    // Driver code
    public static void main(String[] args) {
        int a[] = {1, 0, 0, 1, 0, 1, 0, 1};
        int k = 2;
        int n = a.length;
        System.out.println(longestSubSeg(a, n, k));
    }
}