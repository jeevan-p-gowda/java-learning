package LambdaExpression.Functional;

import java.util.function.Function;

public class Demo1 {
    public static void main(String[] args) {
        Function<Integer,Integer> f=i->i*i;
        System.out.println(f.apply(5));

        Function<String,Integer> f1=s->s.length();
        System.out.println(f1.apply("Welcome"));

        Function<Integer,Integer> f2=i->i*i;
        Function<Integer,Integer> f3=i->i+i+i;
        System.out.println(f2.andThen(f3).apply(2));
        System.out.println(f2.compose(f3).apply(2));
    }
}
