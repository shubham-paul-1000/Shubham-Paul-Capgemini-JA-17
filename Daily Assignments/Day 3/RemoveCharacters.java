import java.util.Scanner;
public class RemoveCharacters {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the two strings:");
		String st1=sc.next();
		String st2=sc.next();
		char c[]=new char[256];
		int i,j;
		for(i=0;i<256;i++)
		{
			c[i]=0;
		}
		for(i=0;i<st2.length();i++)
		{
			c[(int)st2.charAt(i)]++;
		}
		for(i=0;i<256;i++)
		{
			if(c[i]>0)
			{
				st1=st1.replace(((char)i)+"","");
			}
		}
		System.out.println("The string after removing characters = "+st1);
	}

}
