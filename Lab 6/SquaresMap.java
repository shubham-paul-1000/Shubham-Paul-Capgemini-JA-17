import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class SquaresMap {
	public static Map<Integer,Integer> getSquares(int arr[])
	{
		Map<Integer,Integer> squares=new HashMap<Integer,Integer>();
		for(int i=0;i<arr.length;i++)
		{
			squares.put(arr[i],arr[i]*arr[i]);
		}
		return squares;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the size of the array:");
		int n=sc.nextInt();
		System.out.println("Enter the elements of the array:");
		int i;
		int array[]=new int[n];
		for(i=0;i<n;i++)
		{
			array[i]=sc.nextInt();
		}
		Map<Integer,Integer> squares=getSquares(array);
		System.out.println("The array elements with their squares:");
		for(Entry<Integer, Integer> iterate : squares.entrySet())
		{
			System.out.println(iterate.getKey()+" : "+iterate.getValue());
		}
		sc.close();
	}
}
