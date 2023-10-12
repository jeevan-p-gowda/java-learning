package Programs.Easy;

public class IntLargest {
    static int getLargestInt(int a,int b,int c){
        return Math.max(c, (Math.max(a, b)));
    }

    public static void main(String[] args) {
        System.out.println(getLargestInt(20,30,40));
    }
}
