import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.Scanner;
import java.util.regex.Pattern;
public class MainCustomer {
	public static boolean validateCid(int id)
	{
		String s="^[1-9]|[1-9][0-9]$";
		return Pattern.compile(s).matcher(String.valueOf(id)).matches();
	}
	public static boolean validateCustname(String custname)
	{
		String s="^[A-Za-z]+$";
		return Pattern.compile(s).matcher(custname).matches();
	}
	public static boolean validateAge(int age)
	{
		if(age>0 && age<100)
		{
			return true;
		}
		return false;
	}
	public static boolean validateEmail(String email)
	{
		String s="^[A-Za-z0-9+_.-]+@(.+)\\.(.+)$";
		return Pattern.compile(s).matcher(email).matches();
	}
	public static boolean validateMobileNumber(String mobileNumber)
	{
		String s="^[6-9]{1}[0-9]{9}$";
		return Pattern.compile(s).matcher(mobileNumber).matches();
	}
	public static void main(String[] args) {
		ArrayList<Customer> custList = new ArrayList<Customer>();
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
		int id,age;
		String dob;
		String mobileNumber;
		String email,custname;
		char ch;
		do
		{
			System.out.println("Enter 1 to create customer.");
			System.out.println("Enter 2 to update customer.");
			System.out.println("Enter 3 to display customer.");
			System.out.println("Enter 4 to delete customer.");
			System.out.println("Enter your choice:");
			int choice = sc.nextInt();
			switch(choice)
			{
			case 1:
				System.out.println("Enter ID:");
				id = sc.nextInt();
				sc.nextLine();
				
				System.out.println("Enter Name:");
				custname = sc.nextLine();
				
				
				System.out.println("Enter Age:");
				age = sc.nextInt();
				
				System.out.println("Enter Mobile No.:");
				mobileNumber = sc.next();
				sc.nextLine();
				
				System.out.println("Enter DOB as dd-mm-yyyy:");
				
				dob = sc.nextLine();
				Date date;
				sc.nextLine();
				
				System.out.println("Enter Email:");
				email = sc.nextLine();
				try
				{
					date = sdf.parse(dob);
					if(validateCid(id) && validateCustname(custname) && validateAge(age) && validateEmail(email) && validateMobileNumber(mobileNumber))
					{
						custList.add(new Customer(id,custname,age,date,email,mobileNumber));
					}
					else
					{
						System.out.println("Wrong Input. Cannot create coustomer.");
					}
				}
				catch(ParseException pe)
				{
					System.out.println("Wrong Input. Cannot create coustomer");
				}
				break;
			case 2:
				System.out.println("Enter id to update:");
				int u_id = sc.nextInt();
				for(int i=0; i<custList.size();i++)
				{
					if(custList.get(i).getCid() == u_id)
					{
						sc.nextLine();
						System.out.println("Enter Name:");
						custname = sc.nextLine();
						//System.out.println(u_name);
						if(validateCustname(custname))
							custList.get(i).setCustname(custname);
						else
							System.out.println("Invalid input.");
						
						
						System.out.println("Enter Age:");
						age = sc.nextInt();
						if(validateAge(age))
							custList.get(i).setAge(age);
						else
							System.out.println("Invalid input.");
						
						//sc.nextLine();
						System.out.println("Enter Mobile No.:");
						mobileNumber = sc.next();
						if(validateMobileNumber(mobileNumber))
							custList.get(i).setMobileNumber(mobileNumber);
						else
							System.out.println("Invalid input.");
						
						sc.nextLine();
						
						System.out.println("Enter DOB as dd-mm-yyy:");
						try
						{
							custList.get(i).setDob(sdf.parse(sc.nextLine()));
						}
						catch(ParseException pe)
						{
							System.out.println("Wrong Input. Cannot create coustomer.");
						}
					
						System.out.println("Enter Email:");
						email = sc.nextLine();
						if(validateEmail(email))
						custList.get(i).setEmail(email);
						else
							System.out.println("Invalid input");
					}
				}
				break;
			case 3:
				Iterator<Customer> citr = custList.iterator();
				while(citr.hasNext())
				{
					Customer cs = citr.next();
					System.out.println("ID:"+cs.getCid()+", NAME:"+cs.getCustname()+", AGE:"+cs.getAge()+", Mobile No.:"+cs.getMobileNumber()+", EMAIL:"+cs.getEmail()+", DOB:"+sdf.format(cs.getDob()));
				}
				break;
			case 4:
				Iterator<Customer> d_citr = custList.iterator();
				System.out.println("Enter customer id:");
				int d_id = sc.nextInt();
				while(d_citr.hasNext())
				{
					Customer cs = d_citr.next();
					if(cs.getCid() == d_id)
					{
						d_citr.remove();
					}
				}
				break;
			default:
				System.out.println("Wrong choice.");
			}
			System.out.println("Enter y to continue:");
			ch = sc.next().trim().charAt(0);
		}while(ch == 'y');
	}

}
