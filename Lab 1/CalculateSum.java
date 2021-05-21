import java.util.Scanner;
public class CalculateSum {
	public static int calculateSum(int n)
	{
		int i,j=3,sum=0;
		for(i=0;i<n;)
		{
			if(j%3==0 || j%5==0)
			{
				sum+=j;
				i++;
			}
			j++;
		}
		return sum;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the limit:");
		int n=sc.nextInt();
		System.out.println("Sum of first n natural numbers divisible by 3 or 5 = "+calculateSum(n));
		sc.close();
	}

}
