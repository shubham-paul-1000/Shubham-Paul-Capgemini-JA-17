import java.util.Scanner;
public class StringMirrorImage {
	public static String getImage(String s)
	{
		StringBuffer st1=new StringBuffer(s);
		StringBuffer st2=new StringBuffer(s);
		st2.reverse();
		st1.append('|');
		st1.append(st2);
		return st1.toString();
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a String:");
		String st=sc.nextLine();
		st=getImage(st);
		System.out.println("The mirror image of the String is:\n"+st);
		sc.close();
	}
}
