package Programs.Easy;

public class IntPrimeNumber {
    public static void isPrime(int num){
        int count=0;

        for (int i = 1; i <= num; i++) {
            if (num%i==0){
                count++;
            }
        }
        if (count==2){
            System.out.println(num+" is a prime number");
        }
        else{
            System.out.println("Not a prime number");
        }
    }

    public static void main(String[] args) {
        isPrime(13);
    }
}
