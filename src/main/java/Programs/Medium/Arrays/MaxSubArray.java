package Programs.Medium.Arrays;

public class MaxSubArray {
    public int getMaxSubArrayForSizeKM1(int a[], int k) {
        int maxSum = 0, windowSum = 0;
        for (int i = 0; i < k; i++) {
            windowSum += a[i];
        }
        for (int j = k; j < a.length; j++) {
            maxSum += a[j] - a[j - k];
            maxSum = Math.max(maxSum, windowSum);
        }
        return maxSum;
    }

    public static void main(String[] args) {
        System.out.println(new MaxSubArray().getMaxSubArrayForSizeKM1(new int[]{3,1,4,-2,9,-4},3));
    }
}