import java.util.Scanner;
public class Harshad {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number:");
		int n=sc.nextInt();
		int n1=n,sum=0;
		while(n1>0)
		{
			sum+=n1%10;
			n1=n1/10;
		}
		if(n%sum==0)
		{
			System.out.println("The no. is a Harshad Number");
		}
		else
		{
			System.out.println("The no. is not a Harshad Number");
		}
	}
}
