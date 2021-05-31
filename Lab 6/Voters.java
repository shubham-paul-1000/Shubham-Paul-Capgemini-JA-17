import java.util.Scanner;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class Voters {
	public static List votersList(Map<Integer,Date> voters)
	{
		List<Integer> eligibleVoters=new ArrayList<Integer>();
		LocalDate ldt=LocalDate.now();
		Period age;
		for(Entry<Integer, Date> iterator : voters.entrySet())
		{
			age = Period.between(iterator.getValue().toInstant().atZone(ZoneId.systemDefault()).toLocalDate(), ldt);
			if(age.getYears()>18)
			{
				eligibleVoters.add(iterator.getKey());
			}
		}
		return eligibleVoters;
	}
	public static void main(String[] args) throws ParseException {
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf=new SimpleDateFormat("dd-mm-yyyy");
		Map<Integer,Date> voters=new HashMap<Integer,Date>();
		System.out.print("Enter the no. of people to be checked:");
		int n=sc.nextInt();
		int i,id;
		Date dob;
		String s;
		System.out.println("Enter the details of each person:");
		for(i=0;i<n;i++)
		{
			System.out.print("Enter the ID:");
			id=sc.nextInt();
			System.out.print("Enter the Date of Birth as dd-mm-yyyy:");
			s=sc.next();
			dob=sdf.parse(s);
			voters.put(id, dob);
		}
		List<Integer> eligibleVoters = votersList(voters);
		if(eligibleVoters.size()<1)
		{
			System.out.println("No eligible voters in the list!");
			System.exit(0);
		}
		System.out.println("The voters with the following ids are eligible for voting:");
		for(i=0;i<eligibleVoters.size();i++)
		{
			System.out.println(eligibleVoters.get(i));
		}
		sc.close();
	}
}
