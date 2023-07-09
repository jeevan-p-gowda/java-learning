package LambdaExpression.Predicator;

import java.util.function.Predicate;

//Predicate has single paramaterized abstract method with boolean return type called test()
public class PredicateExample {
    public static void main(String[] args) {

        //Case 1 - Verify Integer
        Predicate<Integer> p= i->(i>10);
        System.out.println(p.test(10));

        //Case 2 - Verify String length
        Predicate<String> pr= s->(s.length()>4);
        System.out.println(pr.test("Jeevan"));

        //Case 3 - Verify array strings length
        String a[]={"Michael","David","John","Scott"};
        for(String value:a){
            if(pr.test(value)){
                System.out.println(value);
            }
        }

    }

}