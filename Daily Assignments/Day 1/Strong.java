import java.util.Scanner;
class Strong
{
	public static int fact(int n)
	{
		int i,f=1;
		for(i=2;i<=n;i++)
		{
			f=f*i;
		}
		return f;
	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the no.:");
		int n=sc.nextInt();
		int sum=0;
		int n1=n;
		while(n1>0)
		{
			sum+=fact(n1%10);
			n1=n1/10;
		}
		if(sum==n)
			System.out.println("The number is strong");
		else
			System.out.println("The number is not strong");
	}
}