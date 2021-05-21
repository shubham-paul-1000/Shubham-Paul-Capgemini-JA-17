import java.util.*;
public class ModifyNumber {
	public static int modifyNumber(int n)
	{
		int n1=0;
		StringBuffer st=new StringBuffer(String.valueOf(n));
		st.reverse();
		n=Integer.valueOf(st.toString());
		while(n>9)
		{
			n1=n1*10+Math.abs((n%10)-((n/10)%10));
			n=n/10;
		}
		n1=n1*10+n;
		return n1;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a number:");
		int n=sc.nextInt();
		System.out.println("Modified number = "+modifyNumber(n));
		sc.close();
	}
}
