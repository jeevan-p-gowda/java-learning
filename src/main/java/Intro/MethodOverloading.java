package Intro;

public class MethodOverloading
{
    int a,b;

    void sum()
    {
        a=10;
        b=20;
        System.out.println(a+b);
    }
    void sum(int a,int b)
    {
        this.a=a;
        this.b=b;
        System.out.println(a+b);
    }
    void sum(int x, double y)
    {
        System.out.println(x+y);
    }

    public static void main(String[] args)
    {
        MethodOverloading mo=new MethodOverloading();
        mo.sum();
        mo.sum(20,90);
        mo.sum(30,2.5);
    }
}
