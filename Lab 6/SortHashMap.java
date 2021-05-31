import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class SortHashMap {
	static Scanner sc=new Scanner(System.in);
	public static List getValues(HashMap<String,Integer> unsortedList){
		System.out.println("Enter\ntrue for ascending order\nfalse for descending order");
		boolean b=sc.nextBoolean();
		List<Map.Entry<String, Integer>> sortedList = new ArrayList<>(unsortedList.entrySet());
		Collections.sort(sortedList, new Comparator<Map.Entry<String, Integer>>() {
			public int compare(Map.Entry<String, Integer> m1, Map.Entry<String, Integer> m2) {
				if(b)
				{
					return m1.getValue()-m2.getValue();
				}
				else
				{
					return m2.getValue()-m1.getValue();
				}
			}
		});
		return sortedList;
	}
	public static void main(String[] args) {
		HashMap<String,Integer> unsortedList=new HashMap<>();
		System.out.print("Enter the size of the Hash Map:");
		int n=sc.nextInt();
		int i,value;
		String key;
		if(n<1)
		{
			System.out.println("Size should be atleast 1!");
			System.exit(0);
		}
		for(i=0;i<n;i++)
		{
			System.out.println("Enter the key and integer value:");
			key=sc.next();
			value=sc.nextInt();
			unsortedList.put(key, value);
		}
		List<Map.Entry<String, Integer>> sortedList=getValues(unsortedList);
		System.out.println("The list after sorting:");
		for(i=0;i<sortedList.size();i++)
		{
			System.out.println(sortedList.get(i));
		}
		sc.close();
	}
}
