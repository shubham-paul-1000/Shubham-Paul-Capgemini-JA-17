package com.cg.eis.service;
import java.util.Scanner;
import com.cg.eis.bean.Employee;
public class EmployeeService extends Employee{
	Employee e=new Employee(); 
	public void getEmpDetails() {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter id:");
		e.id=sc.nextInt();
		System.out.print("Enter name:");
		e.name=sc.next();
		System.out.print("Enter salary:");
		e.salary=sc.nextDouble();
		System.out.print("Enter designation:");
		e.designation=sc.next();
		sc.close();
	}
	public void displayEmpDetails() {
		e.insuranceScheme="No Scheme";
		if((e.salary>=10000 && e.salary<15000) && e.designation.equalsIgnoreCase("Commandent"))
			e.insuranceScheme="Scheme C";
		else if((e.salary>=15000 && e.salary<20000) && e.designation.equalsIgnoreCase("Inspector"))
			e.insuranceScheme="Scheme B";
		else if(e.salary>=20000 && e.designation.equalsIgnoreCase("Constable"))
			e.insuranceScheme="Scheme A";
		else if(e.salary<5000 && e.designation.equalsIgnoreCase("Sergeant"))
			e.insuranceScheme="No Scheme";
		System.out.println("Employee id\tName\tSalary\tDesignation\tInsurance scheme");
		System.out.println("____________________________________________________________");
		System.out.println();
		System.out.println(e.id+"\t\t"+e.name+"\t"+e.salary+"\t"+e.designation+"\t\t"+e.insuranceScheme);
			
	}
}