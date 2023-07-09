package LambdaExpression.Consumer;

import java.util.function.Consumer;

public class chaining {
    public static void main(String[] args) {
        Consumer<String> co=s->System.out.println(s+" "+ "is White");
        Consumer<String> co1=s-> System.out.println(s+" "+ "is has four legs");

        Consumer<String> co3=co.andThen(co1);

        co.andThen(co1).accept("cow");
        co3.accept("Dog");
    }
}
