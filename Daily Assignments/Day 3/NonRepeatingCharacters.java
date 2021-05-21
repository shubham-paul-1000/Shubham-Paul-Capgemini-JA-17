import java.util.Scanner;
public class NonRepeatingCharacters
{
	public static void main(String[] args) 
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
		boolean f=false;
		String res="";
		for(i=0;i<256;i++)
		{
			if(c[i]==1)
			{
				if(f)
				{
					res=res+",";
				}
				res=res+(char)i;
				f=true;
			}
		}
		if(res.length()==0)
		{
			System.out.println("No non repeating characters present");
		}
		else
		{
			System.out.println("The non repeating characters are: "+res);
		}
		sc.close();
	}
}
