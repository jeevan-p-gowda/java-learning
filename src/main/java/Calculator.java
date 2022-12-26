public class Calculator {
    protected int add(int firstNumber, int secondNumber) {
        return firstNumber + secondNumber;
    }

    protected int subtract(int firstNumber, int secondNumber) {
        return firstNumber - secondNumber;
    }

    public int multiply(int firstNumber, int secondNumber) {
        return firstNumber * secondNumber;
    }

    protected double percentage(int number, int total) {
        return number * 100 / total;
    }

    public int square(int number) {
        return number * number;
    }
}
