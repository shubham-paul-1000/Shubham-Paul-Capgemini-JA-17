import java.util.Scanner;
public class UsernamePasswordValidationMain {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		UsernamePasswordValidationUsingLambdaExpression upv = (username,password)->{
			return (username.equals("Ram") && password.equals("abcd1234"));
		};
		System.out.print("Enter the username : ");
		String username=sc.next();
		System.out.print("Enter the password : ");
		String password=sc.next();
		System.out.println("\nAuthentication Status : "+upv.validateusername_password(username, password));
		sc.close();
	}

}
