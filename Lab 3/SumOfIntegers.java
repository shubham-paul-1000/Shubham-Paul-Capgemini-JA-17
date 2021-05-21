import java.util.*;
public class SumOfIntegers {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the line of integers:");
		String s=sc.nextLine();
		StringTokenizer st;
		int sum=0,n;
		System.out.println("The entered integers are:");
		for(st=new StringTokenizer(s);st.hasMoreTokens();)
		{
			n=Integer.valueOf(st.nextToken());
			System.out.println(n);
			sum+=n;
		}
		System.out.println("The sum of the entered integers = "+sum);
		sc.close();
	}
}
