package Collections.List;

import java.util.List;

public class ArrayList
{
    public static void main(String[] args) {
        List<Character> al=new java.util.ArrayList<Character>();
        al.add('A');
        al.add('B');
        al.add('C');
        al.add('A');

        boolean status = al.contains('C');
        System.out.println(al.indexOf('C'));
        System.out.println(al.lastIndexOf('A'));
        System.out.println(al);
        System.out.println(status);
        al.clear();
        System.out.println(al);
        System.out.println(al.isEmpty());
    }
}
