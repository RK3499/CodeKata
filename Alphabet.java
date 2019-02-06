import java.util.*;

class Alphabet {

    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
	      char ch=scanner.next().charAt(0);

        if( (ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z'))
            System.out.println("Alphabet");
        else
            System.out.println("no");
    }
}
