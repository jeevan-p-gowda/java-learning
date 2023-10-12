package Collections.Set;

public class TreeSet
{
    public static void main(String args[]) {
        java.util.TreeSet<Integer> numbers = new java.util.TreeSet<>();
        numbers.add(31);
        numbers.add(42);
        numbers.add(54);
        numbers.add(21);
        numbers.add(64);
        numbers.add(4);
        numbers.add(10);
        numbers.add(51);

        System.out.println(numbers); // ordered set [4,10,21,31,42,51,54,64]
        System.out.println(numbers.first()); // 4
        System.out.println(numbers.last()); // 64
        System.out.println(numbers.subSet(4,20)); // 64
        System.out.println(numbers.headSet(21)); // [4, 10] numbers in set less than 21
        System.out.println(numbers.tailSet(11)); // [21,31,42,51,53,64] numbers greater than 11

    }
}
