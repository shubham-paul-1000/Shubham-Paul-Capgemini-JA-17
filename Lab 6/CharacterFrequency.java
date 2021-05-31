import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
public class CharacterFrequency {
	public static Map<Character, Integer> countChars(char arr[])
	{
		int i,l=arr.length;
		int characters[]=new int[256];
		Arrays.fill(characters,0);
		for(i=0;i<l;i++)
		{
			characters[(int)arr[i]]++;
		}
		Map<Character,Integer> charFrequency=new HashMap<Character,Integer>();
		for(i=0;i<256;i++)
		{
			if(characters[i]>0)
			{
				charFrequency.put((char)i,characters[i]);
			}
		}
		return charFrequency;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the size of the array:");
		int n=sc.nextInt();
		System.out.println("Enter the characters of the array:");
		int i;
		char array[]=new char[n];
		for(i=0;i<n;i++)
		{
			array[i]=sc.next().charAt(0);
		}
		Map<Character,Integer> characterFrequency=countChars(array);
		System.out.println("Frequency of the characters present in the array:");
		for(Entry<Character, Integer> iterate : characterFrequency.entrySet())
		{
			System.out.println(iterate.getKey()+" : "+iterate.getValue());
		}
		sc.close();
	}

}
