package com.cg.eis.pl;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import com.cg.eis.service.EmployeeService;
import com.cg.eis.bean.Employee;
import com.cg.eis.exception.EmployeeException;
public class MainEmployee {
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		HashMap<Integer,Employee> employees=new HashMap<>();
		int choice;
		char c;
		Employee e;
		EmployeeService es=new EmployeeService();
		do
		{
			System.out.println("Enter\n1 to add employee\n2 to check which employees have a particular scheme\n3 to delete employee");
			choice=sc.nextInt();
			switch(choice)
			{
			case 1:
				e=es.createEmployee();
				employees.put(e.getId(),e);
				break;
			case 2:
				if(employees.size()<1)
				{
					System.out.println("Empty List!");
				}
				else
				{
					es.displayInsuranceSchemeEmployees(employees);
				}
				break;
			case 3:
				if(employees.size()<1)
				{
					System.out.println("Empty List!");
				}
				else
				{
					employees=es.deleteEmployee(employees);
				}
				break;
				default:
					System.out.println("Wrong input");
			}
			System.out.print("Do you want to continue?(y/n)");
			c=sc.next().charAt(0);
		}while(c=='y' || c=='Y');
	}
}