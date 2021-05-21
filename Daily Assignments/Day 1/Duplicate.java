import java.util.Scanner;
class Duplicate
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the no.:");
		int n=sc.nextInt();
		int n1=n;
		int a[]=new int[10];
		int i;
		for(i=0;i<10;i++)
		{
			a[i]=0;
		}
		while(n1>0)
		{
			a[n1%10]++;
			n1/=10;
		}
		boolean f=false;
		for(i=0;i<10;i++)
		{
			if(a[i]>1)
			{
				if(f)
				{
					System.out.print(",");
				}
				else
				{
					System.out.println("Duplicates:");
				}
				System.out.print(i);
				f=true;
			}
		}
		if(f==false)
		{
			System.out.println("No Duplicates");
		}
	}
}