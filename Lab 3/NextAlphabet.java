import java.util.Scanner;
public class NextAlphabet {
	public static String alterString(String s)
	{
		char c[]=s.toCharArray();
		int i,temp;
		for(i=0;i<c.length;i++)
		{
			if(c[i]=='A'||c[i]=='a'||c[i]=='E'||c[i]=='e'||c[i]=='I'||c[i]=='i'||c[i]=='O'||c[i]=='o'||c[i]=='U'||c[i]=='u')
			{
				continue;
			}
			else if(c[i]=='Z')
			{
				c[i]='A';
			}
			else if(c[i]=='z')
			{
				c[i]='a';
			}
			else
			{
				c[i]=(char)((int)c[i]+1);
			}
		}
		return new String(c);
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string:");
		String s=sc.nextLine();
		s=alterString(s);
		System.out.println("ALtered string = "+s);
		sc.close();
	}
}
