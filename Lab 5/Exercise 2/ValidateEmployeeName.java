import java.util.Scanner;
public class ValidateEmployeeName {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the first name and last name:");
		String firstName=sc.next();
		String lastName=sc.next();
		try
		{
			if(firstName.isEmpty())
			{
				throw new InvalidNameException("First Name is empty");
			}
			else if(lastName.isEmpty())
			{
				throw new InvalidNameException("Last Name is empty");
			}
		}
		catch(InvalidNameException i)
		{
			System.out.println(i.getMessage());
		}
	}

}