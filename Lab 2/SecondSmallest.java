import java.util.Scanner;
public class SecondSmallest {
	public static int getSecondSmallest(int arr[])
	{
		int n=arr.length;
		int i,j,temp;
		for(i=0;i<n;i++)
		{
			for(j=0;j<n-i-1;j++)
			{
				if(arr[j]>arr[j+1])
				{
					temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		return arr[1];
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter length of the array:");
		int n=sc.nextInt();
		int array[]=new int[n];
		System.out.println("Enter the elements of the array:");
		int i;
		for(i=0;i<n;i++)
		{
			array[i]=sc.nextInt();
		}
		int ans=getSecondSmallest(array);
		System.out.println("Second smallest element in the array = "+ans);
		sc.close();
	}

}
