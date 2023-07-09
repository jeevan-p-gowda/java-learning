package LambdaExpression;

//Functional interface introduction and hands on
@FunctionalInterface
public interface Test {
   // public void bookcab();
   public String bookcab(String source,String dest);
}
/*class Ola implements Test{

    @Override
    public void bookcab() {
        System.out.println("Ola cab booked..");
    }
}*/
class Executor{
    public static void main(String[] args) {
       //Test te=new Ola(); //calling methods directly from interface
       //Test te=()->System.out.println("Ola cab booked.."); printing only one statement
        Test te=(source,dest)->{
            System.out.printf("Ola cab booked from %s to %s%n",source,dest);
                    return ("Rs.5000/-");
        };
        //te.bookcab();
        System.out.println(te.bookcab("Bangalore","Mumbai"));
    }
}
