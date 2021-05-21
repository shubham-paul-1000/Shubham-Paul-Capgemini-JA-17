import java.util.Scanner;
public class CheckPower {
	public static boolean checkNumber(int n)
	{
		while(n>2)
		{
			if(n%2!=0)
			{
				return false;
			}
			n/=2;
		}
		return true;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a number:");
		int n=sc.nextInt();
		if(checkNumber(n))
		{
			System.out.println("The number is a power of 2");
		}
		else
		{
			System.out.println("The number is not a power of 2");
		}
		sc.close();
	}

}
