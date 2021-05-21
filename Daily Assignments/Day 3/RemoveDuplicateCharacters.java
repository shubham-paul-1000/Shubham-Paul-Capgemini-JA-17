import java.util.Scanner;
public class RemoveDuplicateCharacters {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the string:");
		String st1=sc.next();
		char c[]=new char[256];
		int i,j;
		for(i=0;i<256;i++)
		{
			c[i]=0;
		}
		for(i=0;i<st1.length();i++)
		{
			c[(int)st1.charAt(i)]++;
		}
		for(i=0;i<256;i++)
		{
			if(c[i]>1)
			{
				st1=st1.replace(((char)i)+"","");
			}
		}
		System.out.println("The string after removing duplicates = "+st1);
	}
}
