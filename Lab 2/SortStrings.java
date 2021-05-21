import java.util.Scanner;
public class SortStrings {
	public static String[]sortStrings(String arr[])
	{
		int n=arr.length;
		int i,j,n1;
		String temp;
		for(i=0;i<n;i++)
		{
			for(j=0;j<n-i-1;j++)
			{
				if(arr[j].compareTo(arr[j+1])>0)
				{
					temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		if(n%2==0)
		{
			n1=n/2;
		}
		else
		{
			n1=n/2+1;
		}
		for(i=0;i<n;i++)
		{
			if(i<n1)
			{
				arr[i]=arr[i].toUpperCase();
			}
			else
			{
				arr[i]=arr[i].toLowerCase();
			}
		}
		return arr;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter length of the array:");
		int n=sc.nextInt();
		String array[]=new String[n];
		System.out.println("Enter the elements of the array:");
		int i;
		for(i=0;i<n;i++)
		{
			array[i]=sc.next();
		}
		array=sortStrings(array);
		for(i=0;i<n;i++)
		{
			System.out.println(array[i]);
		}
		sc.close();
	}
}
