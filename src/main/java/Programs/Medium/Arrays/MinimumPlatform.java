package Programs.Medium.Arrays;

import java.util.Arrays;

public class MinimumPlatform {
    static int getMinimumPlatform(int[] arrival, int[] departure, int arraySize) {
        Arrays.sort(arrival);
        Arrays.sort(departure);
        int platformNeeded = 1, result = 1;
        int arrivalPointer = 1, departurePointer = 0;

        while (arrivalPointer < arraySize && departurePointer < arraySize) {
            if (arrival[arrivalPointer] <= departure[departurePointer]) {
                platformNeeded++;
                arrivalPointer++;
            } else if (arrival[arrivalPointer] > departurePointer) {
                platformNeeded--;
                departurePointer++;
            }
            if(platformNeeded>result){
                result=platformNeeded;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int []arrival={900, 940, 950, 1100, 1500, 1800};
        int []departure={910, 1200, 1120, 1130, 1900, 2000};
        System.out.println(getMinimumPlatform(arrival,departure,arrival.length));
    }
}
