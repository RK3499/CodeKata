import java.util.Scanner;
class EvenNumber 
{
	public static void main(String args[]) 
	{
	    Scanner input = new Scanner(System.in);
	    int a,b,i;
	    a=input.nextInt();
	    b=input.nextInt();
		for (i=a+1;i<=b;i++) 
		{
			if (i % 2== 0) 
			{
				System.out.println(i+" ");
			}
		}
	}
}
