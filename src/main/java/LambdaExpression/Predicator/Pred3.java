package LambdaExpression.Predicator;

import java.util.function.Predicate;

public class Pred3 {
    public static void main(String[] args) {
        int a[]={2,5,4,10,6,15,8,20,10,30,12};
        Predicate<Integer> pr=i->i%2==0;
        Predicate<Integer> pr1=i->i>15;


        for(int i:a){
           // if(pr.and(pr1).test(i)){      //and operator
            //if(pr.or(pr1).test(i)){           //or operator
            if(pr.negate().test(i)){         //negate operator
                System.out.println(i);
            }
        }
    }
}
