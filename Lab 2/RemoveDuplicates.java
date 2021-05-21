import java.util.Scanner;
public class RemoveDuplicates {
	public static int[]modifyArray(int arr[])
	{
		int n=arr.length;
		int i,j,temp;
		for(i=0;i<n;i++)
		{
			for(j=0;j<n-i-1;j++)
			{
				if(arr[j]<arr[j+1])
				{
					temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		int n1=1;
		j=0;
		for(i=1;i<n;i++)
		{
			if(arr[i]!=arr[j])
			{
				n1++;
				j=i;
			}
		}
		int a[]=new int[n1];
		j=0;
		n1=1;
		a[j]=arr[j];
		for(i=1;i<n;i++)
		{
			if(arr[j]==arr[i])
			{
				continue;
			}
			a[n1++]=arr[i];
			j=i;
		}
		return a;
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
		array=modifyArray(array);
		System.out.println("The array after removing duplicates and sorting in descending order:");
		for(i=0;i<array.length;i++)
		{
			System.out.print(array[i]+" ");
		}
		sc.close();
	}
}
