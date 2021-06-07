import java.util.Scanner;
public class FactorialMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		FactorialUsingLambdaExpression fact = (num)->{
			int prod=1;
			for(int i=0;i<=num;i++) {
				if(i==0)
					prod=1;
				else
					prod=prod*i;
			}
			return prod;
		};
		System.out.print("Enter the num:");
		int num = sc.nextInt();
		System.out.println("The factorial is"+fact.factorial(num));
		sc.close();
	}

}
