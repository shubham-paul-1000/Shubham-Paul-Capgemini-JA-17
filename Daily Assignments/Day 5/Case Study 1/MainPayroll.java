import java.util.Scanner;
public class MainPayroll {
	public static void adminPayRoll() {
        Scanner sc = new Scanner(System.in);
        Admin a = new Admin();

        System.out.print("Enter the name: ");
        String name = sc.nextLine();
        System.out.print("Enter the salary: ");
        int salary = sc.nextInt();

        a.adjustSalary(salary);
        a.doAdminStuff();
    }

    public static void academicPayRoll() {
        Scanner sc = new Scanner(System.in);
        Academic a = new Academic();

        System.out.print("Enter the name: ");
        String name = sc.nextLine();
        System.out.print("Enter the salary: ");
        int salary = sc.nextInt();

        a.adjustSalary(salary);
        a.giveLecture();
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter\n1 for Admin Pay Roll\n2 for Academic Pay Roll");
        int choice = sc.nextInt();
        if (choice == 1)
            adminPayRoll();
        else if (choice == 2)
            academicPayRoll();
        else
            System.out.println("Invalid Choice");
    }
}
