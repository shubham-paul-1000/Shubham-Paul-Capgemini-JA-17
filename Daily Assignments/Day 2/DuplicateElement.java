import java.util.Scanner;
public class DuplicateElement{

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter length of the array:");
		int n=sc.nextInt();
		int array[]=new int[n];
		System.out.println("Enter the elements of the array:");
		int i;
		int digits[]= {0,0,0,0,0,0,0,0,0,0,0};
		for(i=0;i<n;i++)
		{
			array[i]=sc.nextInt();
			digits[array[i]]++;
		}
		for(i=0;i<10;i++)
		{
			if(digits[i]>1)
			{
				System.out.println(i+" is duplicated");
			}
		}
	}

}
