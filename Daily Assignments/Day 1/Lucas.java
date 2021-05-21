public class Lucas {
	public static void main(String args[])
	{
		int a=2,b=1,c;
		System.out.println("First 10 numbers in Lucas numbers:");
		System.out.println(a+"\n"+b);
		for(int i=0;i<8;i++)
		{
			c=a+b;
			System.out.println(c);
			a=b;
			b=c;
		}
	}
}
