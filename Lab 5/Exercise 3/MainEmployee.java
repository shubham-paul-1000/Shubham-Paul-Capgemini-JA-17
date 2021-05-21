package com.cg.eis.exception;
import java.util.Scanner;
public class MainEmployee {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the employee salary:");
		double salary=sc.nextDouble();
		try
		{
			if(salary<3000)
			{
				throw new EmployeeException("Invalid Salary");
			}
		}
		catch(EmployeeException e)
		{
			System.out.println(e.getMessage());
		}
		sc.close();
	}
}
