import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Scanner;

public class MedalEligibility {
	public static HashMap<Integer,String> getStudents(HashMap<Integer,Integer> marks)
	{
		HashMap<Integer,String> medals = new HashMap<Integer,String>();
		for(Entry<Integer,Integer> iterate : marks.entrySet())
		{
			if(iterate.getValue()>=90)
			{
				medals.put(iterate.getKey(),"Gold");
			}
			else if(iterate.getValue()>=80)
			{
				medals.put(iterate.getKey(),"Silver");
			}
			else if(iterate.getValue()>=70)
			{
				medals.put(iterate.getKey(),"Bronze");
			}
		}
		return medals;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		HashMap<Integer,Integer> students=new HashMap<Integer,Integer>();
		System.out.print("Enter the number of students:");
		int n=sc.nextInt();
		int i,value,key;
		if(n<1)
		{
			System.out.println("Number of students should be atleast 1!");
			System.exit(0);
		}
		System.out.println("Enter the student registration number and marks:");
		for(i=0;i<n;i++)
		{
			key=sc.nextInt();
			value=sc.nextInt();
			students.put(key, value);
		}
		HashMap<Integer,String> medals = getStudents(students);
		System.out.println("The list of the students who will receive medals:");
		for(Entry<Integer,String> iterate : medals.entrySet())
		{
			System.out.println(iterate.getKey()+" : "+iterate.getValue());
		}
		sc.close();
	}
}
