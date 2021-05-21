import java.util.Scanner;
public class MaximumOccuringCharacter {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the string:");
		String s=sc.next();
		char c[]=new char[256];
		int i;
		for(i=0;i<256;i++)
		{
			c[i]=0;
		}
		for(i=0;i<s.length();i++)
		{
			c[(int)s.charAt(i)]++;
		}
		int pos=0,max=0;
		for(i=0;i<256;i++)
		{
			if(c[i]>max)
			{
				max=c[i];
				pos=i;
			}
		}
		System.out.println("The maximum occuring character is = "+(char)pos);
		sc.close();
	}
}
