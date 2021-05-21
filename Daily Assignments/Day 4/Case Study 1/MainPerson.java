import java.util.Scanner;
public class MainPerson {

    static void studentDetails() {
        Scanner sc = new Scanner(System.in);
        Student student = new Student();
        System.out.print("Enter the name: ");
        String name = sc.nextLine();
        student.setName(name);
        System.out.print("Enter the address: ");
        String address = sc.nextLine();
        student.setAddress(address);
        System.out.print("Enter the year: ");
        int year = sc.nextInt();
        student.setYear(year);
        System.out.print("Enter the program: ");
        String program = sc.next();
        student.setProgram(program);
        sc.nextLine();
        System.out.print("Enter the fee: ");
        double fee = sc.nextDouble();
        student.setFee(fee);
        sc.nextLine();
        System.out.println("The details are: ");
        System.out.println(student.toString());
    }
    static void staffDetails() {
        Scanner sc = new Scanner(System.in);
        Staff staff = new Staff();
        System.out.print("Enter the name: ");
        String name = sc.nextLine();
        staff.setName(name);
        System.out.print("Enter the address: ");
        String address = sc.nextLine();
        staff.setAddress(address);
        System.out.print("Enter the school: ");
        String school = sc.nextLine();
        staff.setSchool(school);
        System.out.print("Enter the pay: ");
        double pay = sc.nextDouble();
        staff.setPay(pay);
        System.out.println("The details are: ");
        System.out.println(staff.toString());
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter\n1 for Student details\n2 for Staff details");
        int choice = sc.nextInt();
        if (choice == 1)
            studentDetails();
        else if (choice == 2)
            staffDetails();
        else
            System.out.println("Enter choice correctly!");
    }
}