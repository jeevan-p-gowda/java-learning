package Streams;

import java.util.ArrayList;
import java.util.List;

public class FilterDemo2 {
    String eName;
    int id;

    FilterDemo2(String eName, int id) {
        this.eName = eName;
        this.id = id;
    }

    public static void main(String[] args) {
        List<FilterDemo2> emp = new ArrayList<>();
        emp.add(new FilterDemo2("Jeevan", 1));
        emp.add(new FilterDemo2("Gulshan", 2));
        emp.add(new FilterDemo2("KrishnaAkash", 3));
        emp.add(new FilterDemo2("Everyone", 4));

        emp.stream().filter(o -> o.id > 1).forEach(o -> System.out.println(o.eName));
    }
}
