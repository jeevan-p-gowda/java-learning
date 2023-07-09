package Programs.Easy;

import java.util.LinkedHashSet;
import java.util.Set;

public class strremdup {
    public static void main(String[] args) {
        String str = "Jeevan P Gowda";
        Set ls = new LinkedHashSet();
        for (int i = 0; i < str.length(); i++) {

            ls.add(str.charAt(i));

        }
        for (Object value:ls) {
            System.out.print(value);
        }
    }
}



