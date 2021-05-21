import java.util.Scanner;
public class DuplicateCharacter {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter length of the array:");
		int n=sc.nextInt();
		int i;
		char array[]=new char[n];
		int alphabets[]=new int[26];
		for(i=0;i<26;i++)
		{
			alphabets[i]=0;
		}
		System.out.println("Enter the characters of the array in lower case:");
		for(i=0;i<n;i++)
		{
			array[i]=sc.next().charAt(0);
			alphabets[((int)array[i])-97]++;
		}
		for(i=0;i<26;i++)
		{
			if(alphabets[i]>1)
			{
				System.out.println(((char)(i+97))+" is duplicated");
			}
		}
	}
}
