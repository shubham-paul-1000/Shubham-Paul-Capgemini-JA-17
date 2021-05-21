class AbundantDeficientPerfect
{
	public static void classifier(int n)
	{
		int i,sum=0;
		for(i=1;i<=n/2;i++)
		{
			if(n%i==0)
			{
				sum+=i;
			}
		}
		if(sum>n)
		{
			System.out.println(n+" is abundant");
		}
		else if(sum<n)
		{
			System.out.println(n+" is deficient");
		}
		else
		{
			System.out.println(n+" is perfect");
		}
	}
	public static void main(String args[])
	{
		int i;
		for(i=1;i<10000;i++)
		{
			classifier(i);
		}
	}
}