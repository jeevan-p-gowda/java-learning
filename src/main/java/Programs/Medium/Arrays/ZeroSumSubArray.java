package Programs.Medium.Arrays;

import java.util.HashSet;
import java.util.Set;

public class ZeroSumSubArray {
    static boolean isZeroSumSubArray(int[] arr) {
        int sum = 0;
        Set<Integer> hs = new HashSet<>();
        for (int j : arr) {
            sum += j;

            if (j == 0 || sum == 0 || hs.contains(0)) {
                return true;
            }
            hs.add(sum);
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(isZeroSumSubArray(new int[]{-3, 2, 3, 1, 6}));
    }
}