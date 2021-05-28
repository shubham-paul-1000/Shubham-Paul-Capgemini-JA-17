import java.util.Scanner;
public class MainAbsCls {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char ch = 'y';
		System.out.println("Enter\n1 for Savings Account\n2 for Current Account\n3 for Fixed Deposit Account");
		int c=sc.nextInt();
		if(c==1) {
		SavingsAccount sa = new SavingsAccount();
		sa.openAccount();
		while (ch == 'y') {
			System.out.println("Enter the choice");
			System.out.println("viewAcc");
			System.out.println("addMoney");
			System.out.println("withDrawMoney");
			System.out.println("CheckBal");
			String option = sc.next();
			switch (option) {
			case "viewAcc":
				sa.viewAccount();
				break;
			case "addMoney":
				sa.addMoney();
				break;
			case "withDrawMoney":
				sa.withDraw();
				break;
			case "CheckBal":
				sa.checkBalance();
				break;
			default:
				System.out.println("Not valid option");

			}// switch close
			System.out.println("do you want to continue");
			ch = sc.next().trim().charAt(0);
		} // while close
		}
		else if(c==2) {
			CurrentAccount ca = new CurrentAccount();
			ca.openAccount();
			while (ch == 'y') {
				System.out.println("Enter the choice");
				System.out.println("viewAcc");
				System.out.println("addMoney");
				System.out.println("withDrawMoney");
				System.out.println("CheckBal");
				String option = sc.next();
				switch (option) {
				case "viewAcc": 
					ca.viewAccount();
					break;
				case "addMoney":
					ca.addMoney();
					break;
				case "withDrawMoney":
					ca.withDraw();
					break;
				case "CheckBal":
					ca.checkBalance();
					break;
				default:
					System.out.println("Not valid option");

				}// switch close
				System.out.println("do you want to continue");
				ch = sc.next().trim().charAt(0);
			} // while close
		}else if(c==3) {
			FixedDepositAccount ca = new FixedDepositAccount();
			ca.openAccount();
			while (ch == 'y') {
				System.out.println("Enter the choice");
				System.out.println("viewAcc");
				System.out.println("addMoney");
				System.out.println("withDrawMoney");
				System.out.println("CheckBal");
				String option = sc.next();
				switch (option) {
				case "viewAcc": 
					ca.viewAccount();
					break;
				case "addMoney":
					ca.addMoney();
					break;
				case "withDrawMoney":
					ca.withDraw();
					break;
				case "CheckBal":
					ca.checkBalance();
					break;
				default:
					System.out.println("Not valid option");

				}// switch close
				System.out.println("do you want to continue");
				ch = sc.next().trim().charAt(0);
			} // while close
		}else {
			System.out.println("Wrong Choice...");
		}
	}// main method close
}// class close