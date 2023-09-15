package Streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Method3 {
    public static void main(String[] args) {
        List<Integer> li=  Arrays.asList(7,2,3,4,5,8);
        List<String> li1=  Arrays.asList("I","2","3");

        //min
        System.out.println(li.stream().min(Comparator.naturalOrder()).get());

        //max
        System.out.println(li.stream().max(Comparator.naturalOrder()).get());

        //reduce - Integers
        System.out.println(li.stream().reduce(Integer::sum).get());

        //reduce - string
        System.out.println(li1.stream().reduce((value,combinedvalue)-> combinedvalue+value).get());
    }
}
