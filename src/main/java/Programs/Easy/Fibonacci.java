package Programs.Easy;

public class Fibonacci {
    static void generateFibonacci(int n){
        int n1=0,n2=1,num=0;
        System.out.println(n1+" "+n2);
        for (int i = 0; i < n; i++) {
            num = n1+n2;
            System.out.print(" "+num);
            n1=n2;
            n2=num;
        }
    }

    public static void main(String[] args) {
        generateFibonacci(10);
    }
}
