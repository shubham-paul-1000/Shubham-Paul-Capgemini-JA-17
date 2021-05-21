import java.util.Scanner;
public class PositiveString {
	public static boolean positiveString(String s)
	{
		s=s.toLowerCase();
		char c1,c2;
		int i,l=s.length();
		for(i=0;i<l-1;i++)
		{
			c1=s.charAt(i);
			c2=s.charAt(i+1);
			if(c1>c2)
				return false;
		}
		return true;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a string:");
		String s=sc.nextLine();
		if(positiveString(s))
		{
			System.out.println("The string is positive");
		}
		else
		{
			System.out.println("The string is not positive");
		}
	}

}
