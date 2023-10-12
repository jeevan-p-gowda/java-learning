package Programs.Medium.Arrays;

import java.util.HashMap;
import java.util.Map;

public class CountSubArrayWithDistinctInteger {
    public static int getCountOfSubArrayWithDistinctInteger(int[] arr, int distinctCount) {
        int leftPointer = 0;
        int count = 0;

        Map<Integer, Integer> hm = new HashMap<>();
        for (int rightPointer = 0; rightPointer < arr.length; rightPointer++) {
            hm.put(arr[rightPointer], hm.getOrDefault(arr[rightPointer], 0) + 1);
            while (hm.size() > distinctCount) {
//                hm.put(arr[leftPointer], hm.getOrDefault(arr[leftPointer], 0) - 1);
                hm.remove(arr[leftPointer]);
                leftPointer++;
            }
            count+=rightPointer-leftPointer+1;
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(getCountOfSubArrayWithDistinctInteger(new int[]{1, 2, 1, 3, 4}, 2));
    }
}


