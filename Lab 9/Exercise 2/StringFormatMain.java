import java.util.Scanner;
public class StringFormatMain {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		StringFormatUsingLambdaExpression se = (str)->{
			char characters[]=str.toCharArray();
			String result="";
			for(int i=0;i<characters.length-1;i++) {
				result+=characters[i]+" ";
			}
			return result+characters[characters.length-1];
		};
		System.out.print("Enter the str : ");
		String str=sc.next();
		System.out.println("\nResultant str = "+se.returnExpression(str));
		
		sc.close();

	}

}
