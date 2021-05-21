import java.util.Scanner;
public class CheckNumber {
	public static boolean checkNumber(int n)
	{
		while(n>9)
		{
			if(n%10<(n/10)%10)
			{
				return false;
			}
			n/=10;
		}
		return true;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a number:");
		int n=sc.nextInt();
		if(checkNumber(n))
		{
			System.out.println("The number is an increasing number");
		}
		else
		{
			System.out.println("The number is not an increasing number");
		}
		sc.close();
	}
}
