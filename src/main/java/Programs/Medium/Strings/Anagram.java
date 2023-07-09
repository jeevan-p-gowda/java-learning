package Programs.Medium.Strings;

import java.util.Arrays;

public class Anagram {
    public void isAnagram(String s1,String s2){
        s1.replace("//s","");
        s2.replace("//s","");

        char[] ch1 = s1.toLowerCase().toCharArray();
        char[] ch2 = s2.toLowerCase().toCharArray();

        Arrays.sort(ch1);
        Arrays.sort(ch2);

        if(Arrays.equals(ch1, ch2)){
            System.out.println("Is Anagram");
        }else{
            System.out.println("Not Anagram");
        }
    }

    public static void main(String[] args) {
        new Anagram().isAnagram("SilenT","LisTe N");
    }
}
