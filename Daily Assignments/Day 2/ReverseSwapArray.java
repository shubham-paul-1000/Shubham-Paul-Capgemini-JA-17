import java.util.Scanner;
public class ReverseSwapArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter length of the array:");
		int n=sc.nextInt();
		int array[]=new int[n];
		System.out.println("Enter the elements of the array:");
		int i,j,k,temp;
		for(i=0;i<n;i++)
		{
			array[i]=sc.nextInt();
		}
		i=0;
		j=n-1;
		System.out.println("Entered array:");
		for(k=0;k<n;k++)
		{
			System.out.print(array[k]+" ");
		}
		System.out.println();
		while(j>i)
		{
			temp=array[i];
			array[i]=array[j];
			array[j]=temp;
			for(k=0;k<n;k++)
			{
				System.out.print(array[k]+" ");
			}
			System.out.println();
			i++;
			j--;
		}
	}

}
