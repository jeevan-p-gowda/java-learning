package Programs.Easy;

public class StringFirstCharUpperCase {
    static String setFirstCharToUpperCase(String inputString) {
        String[] words = inputString.split(" ");
        String resultString = " ";
        for (String word : words) {
            resultString += String.valueOf(word.charAt(0)).toUpperCase() + word.substring(1) + " ";
        }
        return resultString;
    }

    public static void main(String[] args) {
        System.out.println(setFirstCharToUpperCase("sunrises in the east"));
    }
}
