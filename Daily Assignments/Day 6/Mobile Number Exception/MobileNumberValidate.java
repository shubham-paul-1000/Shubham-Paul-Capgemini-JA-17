import java.util.*;
import java.util.regex.Pattern;
public class MobileNumberValidate {

	public static void main(String[] args)throws InvalidMobileNumberException {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the mobile number:");
		long mobileNo=sc.nextLong();
		try
		{
			if(!(Pattern.compile("^[6-9]{1}\\d{9}").matcher(String.valueOf(mobileNo)).matches()))
			{
				throw new InvalidMobileNumberException("Entered Mobile Number is invalid");
			}
		}
		catch(InvalidMobileNumberException i)
		{
			System.out.println(i.getMessage());
		}
	}

}
