package Streams;

import java.util.Arrays;
import java.util.List;
class Employee{
    String ename;
    int id;
    Employee(String ename,int id){
        this.ename=ename;
        this.id=id;
    }
    public String getEname(){
        return this.ename;
    }
    public int getId(){
        return this.id;
    }
}
//parallel stream we use only for performance
public class ParallelStream {
    public static void main(String[] args) {
        List<Employee> lst = Arrays.asList(
                new Employee("John", 1),
                new Employee("Michael", 2),
                new Employee("David", 3),
                new Employee("Scott", 4)
        );
        //Stream
        lst.stream().filter(i->i.id<3).
                limit(2).
                forEach(stu->System.out.println(stu.getEname()+" "+stu.getId()));

        //Parallel Stream
        lst.parallelStream().filter(i->i.id<3).
                limit(2).
                forEach(stu->System.out.println(stu.getEname()+" "+stu.getId()));

        //Convert normal Stream to parallel Stream
        lst.stream().parallel().filter(i->i.id<3).
                limit(2).
                forEach(stu->System.out.println(stu.getEname()+" "+stu.getId()));
    }
}