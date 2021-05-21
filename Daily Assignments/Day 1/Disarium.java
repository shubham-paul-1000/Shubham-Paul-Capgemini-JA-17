import java.util.Scanner;
public class Disarium {
	public static int power(int n,int x)
	{
		int prod=n;
		for(int i=2;i<=x;i++)
		{
			prod*=n;
		}
		return prod;
	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a no.:");
		int n=sc.nextInt();
		String s=String.valueOf(n);
		int l=s.length();
		int n1=n;
		int sum=0;
		while(n1>0)
		{
			sum+=power(n1%10,l);
			n1=n1/10;
			l--;
		}
		if(sum==n)
		{
			System.out.println("The no. is Disarium");
		}
		else
		{
			System.out.println("The no. is not Disarium");
		}
	}
}
