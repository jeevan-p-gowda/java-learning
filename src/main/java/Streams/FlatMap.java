package Streams;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMap {
    public static void main(String[] args) {
        List<Integer> lst1= Arrays.asList(1,2);
        List<Integer> lst2= Arrays.asList(3,4);
        List<Integer> lst3= Arrays.asList(5,6);

        List<List<Integer>> finalList= Arrays.asList(lst1,lst2,lst3);


        List<Integer> result=finalList.stream().flatMap(Collection::stream).collect(Collectors.toList());
        System.out.println(result);

        List<Integer> result1=finalList.stream().flatMap(Collection::stream).map(x->x+10).collect(Collectors.toList());
        System.out.println(result1);
    }
}
