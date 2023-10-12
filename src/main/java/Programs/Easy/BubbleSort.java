package Programs.Easy;

import java.util.Arrays;

public class BubbleSort {
    static String doBubbleSort(int[] intArray){
        for (int i = 0; i < intArray.length; i++) {
            for (int j = i+1; j < intArray.length ; j++) {
                if (intArray[i]>intArray[j]){
                    int num=intArray[i];
                    intArray[i]=intArray[j];
                    intArray[j]=num;
                }

            }
        }
        return Arrays.toString(intArray);
    }

    public static void main(String[] args) {
        int[] input = {4,2,1,5,3};
        System.out.println(doBubbleSort(input));
    }
}
