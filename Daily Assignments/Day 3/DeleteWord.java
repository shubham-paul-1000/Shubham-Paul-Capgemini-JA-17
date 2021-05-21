import java.util.*;
public class DeleteWord
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the sentence:");
		String sentence=sc.nextLine();
		System.out.print("Enter the word to be deleted:");
		String word=sc.next();
		if(sentence.contains(word))
		{
			sentence=sentence.replace(word,"");
		}
		System.out.println("Sentence after deleting the word:\n"+sentence);
		sc.close();
	}

}