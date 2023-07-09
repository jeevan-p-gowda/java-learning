package Streams;

import java.util.Arrays;
import java.util.List;

public class Method3 {
    public static void main(String[] args) {
        List<Integer> li=  Arrays.asList(7,2,3,4,5,8);
        List<String> li1=  Arrays.asList("I","2","3");

        //min
        System.out.println(li.stream().min((val1,val2)->{return val1.compareTo(val2);}).get());

        //max
        System.out.println(li.stream().max((val1,val2)->{return val1.compareTo(val2);}).get());

        //reduce - Integers
        System.out.println(li.stream().reduce((value,combinedvalue)->{return combinedvalue+value;}).get());

        //reduce - string
        System.out.println(li1.stream().reduce((value,combinedvalue)->{return combinedvalue+value;}).get());
    }
}
