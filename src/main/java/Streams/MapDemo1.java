package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapDemo1 {
    public static void main(String[] args) {
        List<String> vehicles= Arrays.asList("Car","Jeep","Lorry","SUV");
        List<String> result;

        result=vehicles.stream().map(String::toUpperCase).collect(Collectors.toList());
        System.out.println(result);
    }
}
