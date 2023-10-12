package Collections.List;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListIterator {
    public static void main(String[] args) {
        List<Character> al = new ArrayList<Character>();
        al.add('A');
        al.add('B');
        al.add('C');
        al.add('A');

        Iterator<Character> itr = al.iterator();

        while (itr.hasNext()) {
            if (itr.next().equals('A')) {
                itr.remove();
            }
        }
        System.out.println(al);
        //nextindex(), previousindex(), hasprevious(), previous(), add(),set() --> listiterator
        /*System.out.println();
        System.out.println("----");
        Iterator<Character> newItr = al.iterator();
        newItr.forEachRemaining(alphabet -> System.out.print(alphabet));*/
    }
}
