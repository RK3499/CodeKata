import java.util.Scanner;
class Check_Leap_Year 
{
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Input:");
        int year = s.nextInt();
        System.out.println(year);
        System.out.println("Output:");
        boolean flag = false;
        if(year % 400 == 0)
        {
            flag = true;
        }
        else if (year % 100 == 0)
        {
            flag = false;
        }
        else if(year % 4 == 0)
        {
            flag = true;
        }
        else
        {
            flag = false;
        }
        if(flag)
        {
            System.out.println("Yes");
        }
        else
        {
            System.out.println("No");
        }
    }
}
