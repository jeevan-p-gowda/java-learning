package Collections.List;

import java.util.Collections;

public class LinkedList
{
    public static void main(String[] args) {
        java.util.LinkedList<Character> ll=new java.util.LinkedList<>();
        ll.add('C');
        ll.add('E');
        ll.add('G');
        ll.add('K');
        System.out.println(ll);

        ll.addFirst('F');
        ll.addLast('V');
        System.out.println(ll.getFirst()+" "+ll.getLast());

        ll.removeFirst();
        ll.removeLast();
        System.out.println(ll);

        Collections.sort(ll);
        System.out.println(ll);
    }
}
