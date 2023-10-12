package Programs.Easy;

public class StringSegregate {
    static void segregateString(String input) {
        char[] charArray = input.toCharArray();
        String chars = " ";
        String num = " ";
        String special = " ";
        for (char c : charArray) {
            if (Character.isAlphabetic(c)) {
                chars += c;
            } else if (Character.isDigit(c)) {
                num += c;
            }else{
                special+=c;
            }
        }
        System.out.printf("Chars:%s, Num:%s, Special:%s",chars,num,special);
    }

    public static void main(String[] args) {
        segregateString("Hi@#1234");
    }
}
