import java.util.Scanner;

class Postive_Negative 
{
    public static void main(String[] args) throws Exception
    {
        try
        {
            Scanner s = new Scanner(System.in);
            System.out.print("Input:\n");
            int n = s.nextInt();
            System.out.print(n);
            System.out.println("\nOutput:\n");
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
                System.out.println("Zero");
            }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}
