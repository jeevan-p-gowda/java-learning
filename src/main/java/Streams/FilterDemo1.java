package Streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterDemo1 {
    public static void main(String[] args) {
        List<Integer> nolist= Arrays.asList(10,15,20,25,30);
        List<Integer> evennolist= new ArrayList<>();

        System.out.println(nolist);

        evennolist=nolist.stream().filter(n->n%2==0).collect(Collectors.toList());
        System.out.println(evennolist);

        evennolist.stream().filter(n->n!=0).forEach(System.out::println);

        List<String> word=Arrays.asList("Jeevan",null,"Rahul",null,"David");
        List<String> result=new ArrayList<>();

        result=word.stream().filter(w->w!=null && w.length()>5).collect(Collectors.toList());
        word.stream().filter(w->w!=null && w.length()>5).forEach(System.out::println);
        System.out.println(result);


    }

}
