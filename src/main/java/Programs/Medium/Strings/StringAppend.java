package Programs.Medium.Strings;

public class StringAppend {
    public static String countStringChar(String input) {
        if (input == null || input.isEmpty()) {
            return input;
        }

        StringBuilder compressed = new StringBuilder();
        int count = 1;

        for (int i = 1; i < input.length(); i++) {
            if (input.charAt(i) == input.charAt(i - 1)) {
                count++;
            } else {
                compressed.append(input.charAt(i - 1));
                compressed.append(count);
                count = 1;
            }
        }

        compressed.append(input.charAt(input.length() - 1));
        compressed.append(count);

        return compressed.toString();
    }

    public static void main(String[] args) {
        String input = "abaacdbb";
        String compressedString = countStringChar(input);
        System.out.println("Input: " + input);
        System.out.println("Output: " + compressedString);
    }
}
