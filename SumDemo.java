import java.util.Scanner;
class SumDemo
{
   public static void main(String args[])
   {
      Scanner scanner = new Scanner(System.in);
      int N=scanner.nextInt();
      int K=scanner.nextInt();
      int i;
      int[] array = new int[10];
      int sum = 0;
      for (i=0; i<N; i++)
      {
    	  array[i] = scanner.nextInt();
      }
      for(i=0;i<K;i++) 
      {
          sum = sum+array[i];
      }
      System.out.println(sum);
   }
}
