package Programs.Easy;

public class StringReverse {
    /**
     * Method-1
     */
    static void getReversedString(String inputString) {
        String reversedString = " ";
        for (int i = inputString.length() - 1; i >= 0; i--) {
            reversedString += inputString.charAt(i);
        }
        System.out.println(reversedString);
    }

    /**
     * Method-2
     */
    static String method2(String inputString) {
        StringBuilder sb = new StringBuilder(inputString);
        String reversedString = sb.reverse().toString();
        return reversedString;
    }

    public static void main(String[] args) {
        getReversedString("Java is a OOP");
        System.out.println(method2("World"));
    }
}
