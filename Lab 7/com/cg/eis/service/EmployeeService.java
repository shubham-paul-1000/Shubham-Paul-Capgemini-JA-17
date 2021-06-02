package com.cg.eis.service;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import com.cg.eis.bean.Employee;
import com.cg.eis.exception.EmployeeException;
public class EmployeeService extends Employee{
	Scanner sc=new Scanner(System.in);
	public Employee createEmployee()
	{
		System.out.print("Enter the employee id:");
		int id=sc.nextInt();
		sc.nextLine();
		System.out.print("Enter the employee name:");
		String name=sc.nextLine();
		System.out.print("Enter the employee salary:");
		double salary=sc.nextDouble();
		sc.nextLine();
		System.out.print("Enter the employee designation:");
		String designation=sc.nextLine();
		String insuranceScheme="No Scheme";
		Employee e;
		if(salary<3000)
		{
			try
			{
				throw new EmployeeException("Invalid Salary");
			}
			catch(EmployeeException ee)
			{
				System.out.println(ee.getMessage());
			}
		}
		else if(salary<5000 && designation.compareTo("Clerk")==0)
		{
			insuranceScheme="No Scheme";
		}
		else if(salary<20000 && designation.compareTo("System Associate")==0)
		{
			insuranceScheme="Scheme C";
		}
		else if(salary<40000 && designation.compareTo("Programmer")==0)
		{
			insuranceScheme="Scheme B";
		}
		else if(designation.compareTo("Manager")==0)
		{
			insuranceScheme="Scheme A";
		}
		e=new Employee(id,name,salary,designation,insuranceScheme);
		return e;
	}
	public void displayInsuranceSchemeEmployees(HashMap<Integer,Employee> employees) {
		String insuranceScheme;
		System.out.print("Enter the scheme to search:");
		sc.nextLine();
		insuranceScheme=sc.nextLine();
		Employee e;
		for(Map.Entry<Integer,Employee> entry : employees.entrySet())
		{
			e=entry.getValue();
			if(e.getInsuranceScheme().compareTo(insuranceScheme)==0)
			{
				e.toString();
			}
		}
	}
	public HashMap<Integer,Employee> deleteEmployee(HashMap<Integer,Employee> employees)
	{
		System.out.print("Enter the id to be deleted:");
		int id=sc.nextInt();
		Employee e=employees.remove(id);
		if(e==null)
		{
			System.out.println("No such id present!");
		}
		return employees;
	}
}