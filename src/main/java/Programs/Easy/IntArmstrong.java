package Programs.Easy;

public class IntArmstrong {
    /**if the sum of its own digits raised to the power number of digits gives the number itself. For example, 0, 1, 153, 370, 371, 407*/
    static boolean isArmstrong(int inputInteger){
        int originalInt = inputInteger, result=0;
        while (inputInteger!=0){
            int remainder = inputInteger % 10;
            result += remainder * remainder * remainder;
            inputInteger /= 10;
        }
        return result==originalInt;
    }

    public static void main(String[] args) {
        System.out.println(isArmstrong(153));
    }
}
