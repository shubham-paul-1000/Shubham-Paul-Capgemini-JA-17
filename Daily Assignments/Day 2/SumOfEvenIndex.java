import java.util.Scanner;
public class SumOfEvenIndex {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter length of the array:");
		int n=sc.nextInt();
		int array[]=new int[n];
		System.out.println("Enter the elements of the array:");
		int i,sumOfEven=0;
		for(i=0;i<n;i++)
		{
			array[i]=sc.nextInt();
		}
		for(i=0;i<n;i++)
		{
			if(i%2==0)
			{
				sumOfEven+=array[i];
			}
		}
		System.out.println("Sum of Even indexes = "+sumOfEven);
	}
}
