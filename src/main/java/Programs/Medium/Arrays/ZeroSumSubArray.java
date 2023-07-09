package Programs.Medium.Arrays;

import java.util.HashSet;
import java.util.Set;

public class ZeroSumSubArray {
    static boolean isZeroSumSubArray(int arr[]) {
        int sum = 0;
        Set<Integer> hs = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];

            if (arr[i] == 0 || sum == 0 || hs.contains(0)) {
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