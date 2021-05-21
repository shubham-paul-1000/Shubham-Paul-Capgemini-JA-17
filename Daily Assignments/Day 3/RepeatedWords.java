import java.util.*;
public class RepeatedWords {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the sentence:");
		String sentence=sc.nextLine();
		String words[]=sentence.split(" ");
		String temp;
		StringTokenizer st=new StringTokenizer(sentence);
		String res="";
		int i,n;
		boolean f;
		for(i=0;i<words.length;i++)
		{
			n=0;
			f=false;
			while(st.hasMoreTokens())
			{
				if(words[i].equalsIgnoreCase(st.nextToken()))
				{
					n++;
				}
				if(n>1)
				{
					if(res.length()>0)
					{
						res=res+",";
					}
					res=res+words[i];
					f=true;
					sentence=sentence.replace(words[i],"");
					break;
				}
			}
			st=new StringTokenizer(sentence);
		}
		if(res.length()==0)
		{
			System.out.println("No repeated words present");
		}
		else
		{
			System.out.println("The repeated words are: "+res);
		}
		sc.close();
	}

}