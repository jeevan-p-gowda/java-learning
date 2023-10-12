package Programs.Easy;

public class IntCount {
    static int getIntCount(int inputInt){
        int count = 0;
        while (inputInt!=0){
            inputInt/=10;
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(getIntCount(123456));
    }
}
