package Programs.Medium.Arrays;

public class BinarySearch {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6,7,8,9};
        int key =2;
        int lo =0;
        int hi = nums.length-1;

         while (lo<=hi){
            int mid = (lo+hi)/2;
            if (nums[mid]==key){
                System.out.println("Element found at "+mid+" th index");
                break;
            } else if (nums[mid]<key) {
                lo = mid+1;
            }else {
                hi = mid-1;
            }
         }
    }
}
