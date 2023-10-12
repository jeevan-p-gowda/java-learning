package Programs.Easy;

public class IntCountEvenOdd {
    static void getEvenOddCount(int inputInt) {
        int evenCount = 0, oddCount = 0;
        while (inputInt != 0) {
            int remainder = inputInt % 10;
            if (remainder % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
            inputInt /= 10;
        }
        System.out.printf("Count of Even is %d and Odd is %d",evenCount,oddCount);
    }

    public static void main(String[] args) {
        getEvenOddCount(1567338);
    }
}
