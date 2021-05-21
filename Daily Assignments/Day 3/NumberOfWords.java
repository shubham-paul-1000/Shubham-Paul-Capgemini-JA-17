import java.util.*;
public class NumberOfWords {
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the sentence:");
		String s=sc.nextLine();
		StringTokenizer st=new StringTokenizer(s);
		System.out.println("Total no. of words in the sentence is = "+st.countTokens());
		sc.close();
	}
}
