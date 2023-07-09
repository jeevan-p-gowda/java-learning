package LambdaExpression.Predicator;

import java.util.ArrayList;
import java.util.function.Predicate;

public class Pred2 {
    String ename;
    int sal;
    int exp;

    Pred2(String name, int salary, int experience) {
        ename = name;
        sal = salary;
        exp = experience;
    }
}
    class ExecutorThis{
        public static void main(String[] args) {
            Predicate<Pred2> pr= e->(e.sal>30000 && e.exp>3);

            ArrayList<Pred2> al=new ArrayList<Pred2>();
            al.add(new Pred2("Michael",50000,5));
            al.add(new Pred2("John",30000,3));
            al.add(new Pred2("David",10000,2));
            al.add(new Pred2("Stark",20000,6));

            for(Pred2 value:al){
                if(pr.test(value)){
                    System.out.println(value.ename);
                }
            }
        }
    }

