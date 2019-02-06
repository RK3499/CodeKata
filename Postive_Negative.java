import java.util.Scanner;

public class Postive_Negative 
{
    public static void main(String[] args) throws Exception
    {
        try
        {
            Scanner s = new Scanner(System.in);
            System.out.print("Enter the number you want to check:");
            int n = s.nextInt();
            if(n > 0)
            {
                System.out.println("Positive");
            }
            else if(n < 0)
            {
                System.out.println("Negative");
            }
            else
            {
                System.out.println("Nuteral");
            }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}
