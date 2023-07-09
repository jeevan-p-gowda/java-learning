package LambdaExpression.Supplier;

import java.util.Date;
import java.util.function.Supplier;

public class Demo1 {
    public static void main(String[] args) {
        Supplier <Date> su=()->new Date();
        System.out.println(su.get());
    }
}
