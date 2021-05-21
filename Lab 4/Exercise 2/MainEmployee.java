package com.cg.eis.pl;
import com.cg.eis.service.EmployeeService;
public class MainEmployee {
	public static void main(String[] args) 
	{
		EmployeeService es=new EmployeeService();
		es.getEmpDetails();
		es.displayEmpDetails();
	}

}