import java.util.Scanner;
public class RemoveIndex {

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
		System.out.print("Enter the index of the element to be removed:");
		int temp=sc.nextInt();
		for(i=temp;i<n-1;i++)
		{
			array[i]=array[i+1];
		}
		n--;
		System.out.println("The new array is:");
		for(i=0;i<n;i++)
		{
			System.out.print(array[i]+" ");
		}
	}

}
