package Programs.Medium.Arrays;

public class SmallestSubWithSum {

    public int smallSubWithSum(int[] arr, int x) {
        int curr_sum = 0, min_len = arr.length + 1;
        int start = 0, end = 0;

        while (end < arr.length) {
            while (curr_sum <= x && end < arr.length) {
                curr_sum += arr[end++];
            }
            while (curr_sum > x && start < arr.length) {
                if (end - start < min_len)
                    min_len = end - start;
                curr_sum -= arr[start++];
            }
        }
        return min_len;
    }

    public static void main(String[] args) {
        System.out.println(new SmallestSubWithSum().smallSubWithSum(new int[]{1,10,3,40,18},50));
    }
}