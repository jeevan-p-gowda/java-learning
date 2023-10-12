package Collections.List;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class ArraysSorted
{
    public static void main(String[] args) {
        ArrayList<String> alphabets = new ArrayList<>(5);
        alphabets.add("C");
        alphabets.add("F");
        alphabets.add("A");
        alphabets.add("D");
        alphabets.add("B");

        System.out.println(alphabets);
        //Sorting in ascending order
        //Sorted using collections class
        Collections.sort(alphabets);
        //Sorted using Streams
       // List<String> sortedALphabets = alphabets.stream().sorted().collect(Collectors.toList());
        System.out.println(alphabets);

        //Sorting in reverse order
        //Sorted using collections class
        //Collections.sort(alphabets,Collections.reverseOrder());
        //System.out.println(alphabets);
        //Sorted using Streams
        List<String> sortedAlphabets = alphabets.stream().sorted(Collections.reverseOrder()).collect(Collectors.toList());
        System.out.println(sortedAlphabets);
    }
}
