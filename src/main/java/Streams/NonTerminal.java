package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class NonTerminal {
    public static void main(String[] args) {
        List<Integer> lst = Arrays.asList(1, 2, 2, 3, 3, 4, 5, 6, 7, 8);

        //distinct and limit
        lst.stream().distinct().limit(4).forEach(System.out::println);
        List<Integer> lst1 = lst.stream().distinct().limit(4).collect(Collectors.toList());
        System.out.println(lst1);


        //toArray
        Object[] lst2 = lst.stream().distinct().limit(4).toArray();
        System.out.println(Arrays.toString(lst2));

        //count
        long count = lst.size();
        System.out.println(count);
    }
}
