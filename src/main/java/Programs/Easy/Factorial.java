package Programs.Easy;

public class Factorial {
    static int getFactorialOfInt(int input) {
        int result = 1;
        for (int i = 1; i <=5; i++) {
            result *= i;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(getFactorialOfInt(5));
    }
}
