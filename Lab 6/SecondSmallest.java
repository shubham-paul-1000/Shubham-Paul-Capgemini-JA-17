import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class SecondSmallest {
	public static int getSecondSmallest(int arr[])
	{
		ArrayList<Integer> arrList=new ArrayList<Integer>();
		for(int i=0;i<arr.length;i++)
		{
			arrList.add(arr[i]);
		}
		Collections.sort(arrList);
		return arrList.get(1);
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the size of the array:");
		int n=sc.nextInt();
		if(n<2)
		{
			System.out.println("Array size must be atleast 2!");
			System.exit(0);
		}
		int array[]=new int[n];
		int i;
		for(i=0;i<array.length;i++)
		{
			array[i]=sc.nextInt();
		}
		System.out.println("The second smallest element in the array is:"+getSecondSmallest(array));
		sc.close();
	}
}
