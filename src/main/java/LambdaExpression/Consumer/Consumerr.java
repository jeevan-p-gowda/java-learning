package LambdaExpression.Consumer;

import java.util.function.Consumer;

public class Consumerr {
    public static void main(String[] args) {
        Consumer<String> co=c->System.out.println(c);
        co.accept("Its a consumer");
    }
}
