import java.util.Scanner;
public class ReverseSort {
	public static int[]getSorted(int arr[])
	{
		int n=arr.length;
		int i,j,temp;
		StringBuffer s;
		for(i=0;i<n;i++)
		{
			s=new StringBuffer(String.valueOf(arr[i]));
			s.reverse();
			arr[i]=Integer.valueOf(s.toString());
		}
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
		return arr;
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
		array=getSorted(array);
		System.out.println("Array after reversing the elements then sorting:");
		for(i=0;i<n;i++)
		{
			System.out.print(array[i]+" ");
		}
		sc.close();
	}

}
