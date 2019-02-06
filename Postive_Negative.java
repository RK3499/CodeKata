import java.util.Scanner;

class Postive_Negative 
{
    public static void main(String[] args) throws Exception
    {
        try
        {
            Scanner s = new Scanner(System.in);
            System.out.print("INPUT");
            int n = s.nextInt();
            if(n > 0)
            {
                System.out.println("OUTPUT");
                System.out.println("Positive");
            }
            else if(n < 0)
            {
                System.out.println("OUTPUT");
                System.out.println("Negative");
            }
            else
            {
                System.out.println("OUTPUT");
                System.out.println("Zero");
            }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}
