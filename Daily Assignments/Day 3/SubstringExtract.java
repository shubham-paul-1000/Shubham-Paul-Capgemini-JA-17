import java.util.*;
public class SubstringExtract {
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the string:");
		String s=sc.next();
		System.out.println("Enter the starting and ending index of the substring from 1 to "+s.length()+":");
		int start=sc.nextInt();
		int end=sc.nextInt();
		String substr=s.substring(start-1,end);
		String rev="";
		for(int i=substr.length()-1;i>=0;i--) {
			rev+=substr.charAt(i);
		}
		if(substr.equalsIgnoreCase(rev))
			System.out.println("The extracted substring is palindrome.");
		else
			System.out.println("The extracted substring is not palindrome.");
		sc.close();
	}

}