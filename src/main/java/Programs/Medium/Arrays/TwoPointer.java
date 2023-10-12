package Programs.Medium.Arrays;

import java.util.Arrays;

public class TwoPointer {
    public int[] addTwoValuesInArrayForGivenK(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        int[] result = new int[2];

        while (start < end) {
            int sum = nums[start] + nums[end];
            if (sum == target) {
                result[0] = start + 1;
                result[1] = end + 1;
                break;
            } else if (sum < target) {
                start++;
            } else {
                end--;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(new TwoPointer().addTwoValuesInArrayForGivenK(new int[]{1, 2, 3, 4, 5}, 9)));
    }
}

