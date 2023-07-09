package Intro;

public class ConstructorLoading
{
    int a,b,c;
    String d;
    public ConstructorLoading()
    {
        a=20;
        b=30;
        System.out.println(a+b+c);

    }
    public ConstructorLoading(int a,int b,String d)
    {
        this();
        System.out.println(a+b+c);
        System.out.println(d);
    }
    public ConstructorLoading(int a, int b,int c)
    {
        this(10,20,"Jeevan");
        this.a=a;
        this.b=b;
        this.c=c;
        //c=30;
        System.out.println(a+b+c);
    }

    public static void main(String[] args) {
        ConstructorLoading cl=new ConstructorLoading(40,50,60);
    }
}
