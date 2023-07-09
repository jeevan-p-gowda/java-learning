package Streams;

import java.util.HashSet;
import java.util.Set;

public class Methods2 {
    public static void main(String[] args) {
        Set<String> hs=new HashSet<>();
        hs.add("One Mango");
        hs.add("Two Apple");
        hs.add("Three Orange");
        hs.add("One Melon");

        //anyMatch() - if any of the above values matches with given value it returns true else false
        boolean result = hs.stream().anyMatch(value -> {
            return value.startsWith("One");
        });
        System.out.println(result);

        //allMatch() - all the values(Partially/Fully) above should get matched with below passed string
        boolean result2=hs.stream().allMatch(value->{
            return value.startsWith("One");
        });
        System.out.println(result2);

        //noneMatch - opposite of anymatch
        boolean result3=hs.stream().noneMatch(value->{
            return value.startsWith("One");
        });
        System.out.println(result3);
    }
}
