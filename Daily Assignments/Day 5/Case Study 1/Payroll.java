public class Payroll {
	public void adjustSalary(int salary)
	{
		int temp;
		for(int i=0;i<3;i++)
		{
			temp=salary%10;
			if(temp>4)
			{
				salary=salary/10+1;
			}
			else
			{
				salary=salary/10-1;
			}
		}
		salary*=1000;
		System.out.println("Salary = "+salary);
	}
}
