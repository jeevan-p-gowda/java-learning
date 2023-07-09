package Programs.Medium.Arrays;

public class TrappingRainWater {
    static long getTrappedWater(int arr[], int n) {
        int left = 0;
        int right = n - 1;
        int leftBar = arr[0];
        int rightBar = arr[n - 1];
        long answer = 0;

        while (left <= right) {
            if (leftBar < rightBar) {
                if (arr[left] > leftBar) {
                    leftBar = arr[left];
                } else {
                    answer += leftBar - arr[left];
                    left++;
                }
            } else {
                if (arr[right] > rightBar) {
                    rightBar = arr[right];
                } else {
                    answer += rightBar - arr[right];
                    right--;
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        int arr[]={3, 0, 2, 0, 4};
        int arrlength = arr.length;
        System.out.println(getTrappedWater(arr,arrlength));
    }
}