import java.util.Scanner;

class Odd_Even 
{
    public static void main(String[] args) throws Exception
    {
        try
        {
            Scanner s = new Scanner(System.in);
            System.out.print("Input:");
            int n = s.nextInt();
            System.out.print("\n"+n+"\n");
            System.out.println("Output:");
            if(n%2==0)
            {
                
                System.out.println("Even");
            }
            else if(n<=0)
            {
                System.out.println("invalid");
            }
            else
            {
                System.out.println("Odd");
            }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}
