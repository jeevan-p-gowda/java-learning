package LambdaExpression.Consumer;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

class Employee{
    String ename;
    int sal;
    String gen;
    Employee(String ename,int sal,String gen){
        this.ename=ename;
        this.sal=sal;
        this.gen=gen;
    }
}
public class Demo1 {
    public static void main(String[] args) {
        List<Employee> li = new ArrayList<>();
        li.add(new Employee("David", 50000, "Male"));
        li.add(new Employee("Noel", 10000, "Female"));
        li.add(new Employee("Scott", 30000, "Male"));
        li.add(new Employee("Nancy", 20000, "Female"));

        //Function
        Function<Employee, Integer> fu = emp -> (emp.sal * 10) / 100;

        //Predicate
        Predicate<Integer> pr = i -> i >= 5000;

        //Consumer
        Consumer<Employee> co = emp -> {
            System.out.printf("%s %s %s%n", emp.ename, emp.sal, emp.gen);
        };
        for(Employee e:li){
            int bonus = fu.apply(e);
            if(pr.test(bonus)){
                co.accept(e);
                System.out.println("Employee Bonus are:"+bonus );
            }
        }
    }
}


