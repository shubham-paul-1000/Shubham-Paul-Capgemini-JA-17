import java.util.Scanner;
public class CalculateDifference {
	public static int calculateDifference(int n)
	{
		int i,sumOfSq=0,sqOfSum=0;
		for(i=1;i<=n;i++)
		{
			sumOfSq+=i*i;
			sqOfSum+=i;
		}
		sqOfSum*=sqOfSum;
		return sumOfSq-sqOfSum;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the limit:");
		int n=sc.nextInt();
		System.out.println("The result difference is = "+calculateDifference(n));
		sc.close();
	}
}
