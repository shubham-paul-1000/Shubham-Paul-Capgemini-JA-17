import java.util.Scanner;
// interface for Display
@FunctionalInterface
interface Display{
	void print();
}
// class with main method for program execution
public class MethodReferenceEmployee {
	private static int id;
	private static String name;
	private static double salary;
	public MethodReferenceEmployee() {
		super();
	}
	public MethodReferenceEmployee(int id, String name, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	// method to display details
	public void display() {
		System.out.println("Employee [ID = " + id + ", Name = " + name + ", Salary = "
				+ salary + "]");
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int id;
		do {
		System.out.print("Enter the ID : ");
		id=sc.nextInt();
		if(id<=0) 
			System.out.println("ID cannot be zero or negative.");
		}while(id<=0);
		String name;
		boolean result=false;
		do {
			sc.nextLine();
		System.out.print("Enter the name : ");
		name=sc.nextLine();
		result=name.matches("^[a-zA-Z\\s]+$");
		if(result==false)
			System.out.println("Name must only consist of alphabets.");
		}while(result==false);
		do {
			System.out.print("Enter the salary:");
			salary=sc.nextDouble();
			if(salary<10000)
				System.out.println("Salary cannot be below 10000!");
		}while(salary<10000);
		MethodReferenceEmployee employee=new MethodReferenceEmployee(id,name,salary);
		Display display = employee::display;
		display.print();
		sc.close();
	}
}
