package Streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapDemo1 {
    public static void main(String[] args) {
        List<String> vehicles= Arrays.asList("Car","Jeep","Lorry","SUV");
        List<String> result= new ArrayList<>();

        result=vehicles.stream().map(s->s.toUpperCase()).collect(Collectors.toList());
        System.out.println(result);
    }
}
