import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ReverseSort {
	public static int[]getSorted(int arr[])
	{
		StringBuffer sb;
		ArrayList<Integer> arrList=new ArrayList<Integer>();
		int i;
		for(i=0;i<arr.length;i++)
		{
			sb=new StringBuffer(arr[i]+"");
			arrList.add(Integer.valueOf(sb.reverse().toString()));
		}
		Collections.sort(arrList);
		for(i=0;i<arrList.size();i++)
		{
			arr[i]=arrList.get(i);
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
		System.out.println("The array after reversing the elements and sorting them:");
		for(i=0;i<n;i++)
		{
			System.out.println(array[i]+" ");
		}
		sc.close();
	}
}
