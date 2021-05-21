import java.util.Scanner;
public class UpperCaseArrangement {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the string:");
		String s=sc.next();
		String s1="";
		for(int i=0;i<s.length();i++)
		{
			if(Character.isUpperCase(s.charAt(i)))
			{
				s1=s1+s.charAt(i);
				s=s.substring(0,i)+s.substring(i+1);
			}
		}
		s1=s1+s;
		System.out.println("The string after pushing the uppercase letter to the front = "+s1);
		sc.close();
	}
}
