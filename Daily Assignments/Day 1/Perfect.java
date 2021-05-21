import java.util.Scanner;
class Perfect
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the no.:");
		int n=sc.nextInt();
		int i,sum=0;
		for(i=1;i<=n/2;i++)
		{
			if(n%i==0)
			{
				sum+=i;
			}
		}
		if(sum==n)
		{
			System.out.println("The number is perfect");
		}
		else
		{
			System.out.println("The number is not perfect");
		}
	}
}