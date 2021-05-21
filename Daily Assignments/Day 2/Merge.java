import java.util.Scanner;
public class Merge {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter lengths of the two arrays:");
		int m=sc.nextInt();
		int n=sc.nextInt();
		int array1[]=new int[m];
		int array2[]=new int[n];
		System.out.println("Enter the values of the first array:");
		int i,j,k;
		for(i=0;i<m;i++)
		{
			array1[i]=sc.nextInt();
		}
		System.out.println("Enter the values of the second array:");
		for(i=0;i<n;i++)
		{
			array2[i]=sc.nextInt();
		}
		int merged[]=new int[m+n];
		int l=m+n;
		i=0;
		j=0;
		k=0;
		while(k<l)
		{
			if(i<m && j<n)
			{
				if(array1[i]<array2[j])
				{
					merged[k]=array1[i];
					i++;
				}
				else
				{
					merged[k]=array2[j];
					j++;
				}
				k++;
			}
			else if(j>=n)
			{
				merged[k]=array1[i];
				i++;
				k++;
			}
			else if(i>=m)
			{
				merged[k]=array2[j];
				j++;
				k++;
			}
		}
		System.out.println("The merged array:");
		for(i=0;i<l;i++)
		{
			System.out.print(merged[i]+" ");
		}
	}

}
