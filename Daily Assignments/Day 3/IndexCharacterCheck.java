import java.util.Scanner;
public class IndexCharacterCheck {
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the st:");
		String st=sc.next();
		System.out.print("Enter the index between 0 to "+st.length()+":");
		int i=sc.nextInt();
		char c=st.charAt(i);
		if(Character.isLetter(c))
			System.out.println(c+" is a letter");
		else if(Character.isDigit(c))
			System.out.println(c+" is a digit");
		else
			System.out.printf(c+" is a special character");
		sc.close();
	}
}