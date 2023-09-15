package Streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Methods {
    public static void main(String[] args) {
        List<Integer> lst = Arrays.asList(4, 1, 3, 9, 6, 7);
        List<Integer> lst1 = Arrays.asList(9, 4, 18, 17, 5);


        //Sorted Method
        List<Integer> sorted = lst.stream().sorted().collect(Collectors.toList());
        System.out.println(sorted);

        List<Integer> reverseSorted = lst.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        System.out.println(reverseSorted);

        //findAny - randomly finds and picks up an element
        Optional<Integer> result = lst.stream().findAny();
        System.out.println(result.get());

        //findFirst
        Optional<Integer> result2 = lst1.stream().findFirst();
        System.out.println(result2.get());

        //concat
        Stream<Integer> stream1 = lst.stream();
        Stream<Integer> stream2 = lst1.stream();
        List<Integer> result3 = Stream.concat(stream1, stream2).collect(Collectors.toList());
        System.out.println(result3);
    }
}
