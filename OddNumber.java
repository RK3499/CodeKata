import java.util.Scanner;
class OddNumber 
{
	public static void main(String args[]) 
	{
	    Scanner input = new Scanner(System.in);
	    int a,b,i;
	    a=input.nextInt();
	    b=input.nextInt();
		for (i=a;i<=b;i++) 
		{
			if (i % 2 != 0) 
			{
				System.out.println(i+" ");
			}
		}
	}
}
