import java.io.*;
import java.util.*;
public class TextCount {
	public static void main(String args[])throws IOException
	{
		Scanner sc=new Scanner(System.in);
		int i,lines=0,words=0,characters=0;
		char c;
		System.out.println("Enter the text file location:");
		String s=sc.nextLine();
		FileInputStream file=new FileInputStream(s);
		int n=file.available();
		for(i=0;i<n;i++)
		{
			c=(char)file.read();
			if(c=='\n')
			{
				lines++;
			}
			else if(Character.isWhitespace(c))
			{
				words++;
				characters++;
			}
			else
			{
				characters++;
			}
		}
		lines++;
		words++;
		System.out.println("No. of lines = "+lines+"\nNo. of words = "+words+"\nNo. of characters = "+characters);
		sc.close();
		file.close();
	}
}
