public class Alphabet {

    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
	      System.out.print("Input:");
	      char ch=scanner.next().charAt(0);

        if( (ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z'))
            System.out.println("Alphabet");
        else
            System.out.println("not");
    }
}
