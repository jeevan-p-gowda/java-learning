package Streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class MapFilter {
    String eName;
    int id;

    MapFilter(String eName, int id) {
        this.eName = eName;
        this.id = id;
    }

    public static void main(String[] args) {
        List<MapFilter> emp = new ArrayList<>();
        emp.add(new MapFilter("Jeevan", 1));
        emp.add(new MapFilter("Gulshan", 2));
        emp.add(new MapFilter("KrishnaAkash", 3));
        emp.add(new MapFilter("Everyone", 4));

        List<Integer> emp2;

        emp2 = emp.stream().filter(o -> o.id > 1).map(o -> o.id).collect(Collectors.toList());
        System.out.println(emp2);

        List<String> emp3 = emp.stream().map(o -> o.eName).sorted().collect(Collectors.toList());
        System.out.println(emp3);
    }
}
