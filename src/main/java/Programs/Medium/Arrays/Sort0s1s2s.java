package Programs.Medium.Arrays;

import java.util.Arrays;

public class Sort0s1s2s {
    public int[] sortColors(int[]nums) {
        int lo = 0;
        int hi = nums.length - 1;
        int mid = 0;
        int temp;
        while (mid <= hi) {
            switch (nums[mid]) {
                case 0: {
                    temp = nums[lo];
                    nums[lo] = nums[mid];
                    nums[mid] = temp;
                    lo++;
                    mid++;
                    break;
                }
                case 1:
                    mid++;
                    break;
                case 2: {
                    temp = nums[mid];
                    nums[mid] = nums[hi];
                    nums[hi] = temp;
                    hi--;
                    break;
                }
            }
        }
        return nums;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(new Sort0s1s2s().sortColors(new int[]{1,0,2,2,1,0,0,2,1})));
    }
}