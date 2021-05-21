import java.util.Scanner;
public class ValidateAge {

	public static void main(String[] args)throws InvalidAgeException {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the age:");
		int age=sc.nextInt();
		try
		{
			if(age<16)
			{
				throw new InvalidAgeException("Invalid Age");
			}
		}
		catch(InvalidAgeException i)
		{
			System.out.println(i.getMessage());
		}
		sc.close();
	}

}
