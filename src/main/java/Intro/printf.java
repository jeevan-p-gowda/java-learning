package Intro;

public class printf
{
    public static void main(String[] args)
    {
        //printf is basically used for formatting statements
        //%s is for string, %n is going for next line
        //%c is for character, %n is going for next line
        //%f is for integer, %n is going for next line
        //%B or %b is for boolean
        System.out.printf("%s%n","Hello");
        System.out.printf("Hi%nJeevan!%n");

        System.out.printf("%c%n",'H');
        System.out.printf("%-10s%n", "Test Vagrant");
        System.out.printf("%f%n",110f);
        System.out.printf("%f%n",53.33);
        System.out.printf("%B%n",true);
        System.out.printf("%b%n",false);
    }
}
