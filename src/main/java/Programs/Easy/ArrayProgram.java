package Programs.Easy;

import java.util.Arrays;

public class ArrayProgram {
}

class ArraysEqual {
    static boolean isArrayEqual(int[] inputArray1, int[] inputArray2) {
        for (int i = 0; i < inputArray1.length; i++) {
            if (!(inputArray1[i] == inputArray2[i])) {
                return false;
            }
        }
        return true;
    }

    static boolean method2(int[] inputArray1, int[] inputArray2) {
        return Arrays.equals(inputArray1, inputArray2);
    }

    public static void main(String[] args) {
        int[] inputArray1 = {1, 2, 3, 4}, inputArray2 = {1, 2, 3, 4};
        System.out.println(isArrayEqual(inputArray1, inputArray2));
        System.out.println(method2(inputArray1, inputArray2));
    }
}

class ArrayMaxInt {
    static int getArrayMaxInt(int[] inputArray) {
    int max = inputArray[0];
        for (int num:inputArray) {
            if(num>max){
                max=num;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] array = {20, 70, 60, 30};
        System.out.println(getArrayMaxInt(array));
    }
}

class ArrayArrangeEvenOdd{
    public static void arrangeEvenOdd(int[] arr) {
        int evenIndex = 0;
        int oddIndex = arr.length - 1;

        while (evenIndex < oddIndex) {
            // Move the evenIndex pointer forward until an odd number is found
            while (arr[evenIndex] % 2 == 0 && evenIndex < oddIndex) {
                evenIndex++;
            }

            // Move the oddIndex pointer backward until an even number is found
            while (arr[oddIndex] % 2 != 0 && evenIndex < oddIndex) {
                oddIndex--;
            }

            // Swap the even and odd elements
            if (evenIndex < oddIndex) {
                int temp = arr[evenIndex];
                arr[evenIndex] = arr[oddIndex];
                arr[oddIndex] = temp;
                evenIndex++;
                oddIndex--;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, 2, 5, 6, 4, 7, 8, 9};

        arrangeEvenOdd(arr);
        System.out.println(Arrays.toString(arr));
    }
}
