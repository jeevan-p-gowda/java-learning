package Programs.Easy;

public class strrep
{
    public static void main(String[] args) {
        String str = "Jeevan";
        for (int i = 0; i < str.length(); i++)
        {
            for (int j = i+1; j < str.length(); j++)
            {
                if(str.charAt(i)==str.charAt(j))
                {
                  System.out.println(str.replaceAll(String.valueOf(str.charAt(i)),""));
                }
            }

        }
    }
}
