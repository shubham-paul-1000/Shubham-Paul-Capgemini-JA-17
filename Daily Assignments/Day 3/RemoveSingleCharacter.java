import java.util.Scanner;
public class RemoveSingleCharacter {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the string:");
		String s=sc.next();
		System.out.print("Enter the character to be removed:");
		char c=sc.next().charAt(0);
		s=s.replace(c+"","");
		System.out.println("The string after removing "+c+" = "+s);
	}

}
