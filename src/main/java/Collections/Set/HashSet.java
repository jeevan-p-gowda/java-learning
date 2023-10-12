package Collections.Set;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Set;

public class HashSet
{
    public static void main(String[] args) {
        Set<Integer> numbers = new java.util.HashSet<>();
        numbers.add(5);
        numbers.add(3);
        numbers.add(2);
        numbers.add(4);
        numbers.add(1);

        System.out.println(numbers); // Random Order, may not be visible in small sets

        ArrayList<Integer> numbersList = new ArrayList<>(numbers);
        Collections.sort(numbersList);

        System.out.println(numbersList); // Sorted Order => 1,2,3,4,5
        //Streams
        numbers.forEach(System.out::print);
        numbers.stream().iterator().forEachRemaining(System.out::print); // Streams
    }
}
