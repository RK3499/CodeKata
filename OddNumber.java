import java.util.Scanner;
public class OddNumber 
{
	public static void main(String args[]) 
	{
	    Scanner input = new Scanner(System.in);
	    int a,b;
	    a=input.nextInt();
	    b=input.nextInt();
		for (int i = a; i <= b; i++) 
		{
			if (i % 2 != 0) 
			{
				System.out.println(i+" ");
			}
		}
	}
}
