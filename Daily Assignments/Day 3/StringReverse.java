import java.util.Scanner;
public class StringReverse {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the String:");
		String s = sc.nextLine();
		String reverse="";
		int i;
		for(i=s.length()-1;i>=0;i--)
		{
			reverse=reverse+s.charAt(i);
		}
		System.out.println("The reverse of the string = "+reverse);
	}
}
