public class MainAccount {
	public static void main(String[] args) 
	{
		Person person1=new Person("Kathy", 22.0f);
		Person person2=new Person("Smith", 44.0f);
		Account account1=new Account(person1.hashCode(),3000,person1);
		Account account2=new Account(person2.hashCode(),2000,person2);
		System.out.println("Initial Account Details:");
		System.out.println();
		System.out.println("Account No.\tAccount Holder\tIntial Balance");
		System.out.println("_______________________________________________");
		System.out.println();
		System.out.println(person1.name+"\t\t"+account1.accNum+"\t"+account1.balance);
		System.out.println(person2.name+"\t\t"+account2.accNum+"\t"+account2.balance);
		account2.deposit(2000);
		account1.withdraw(1000);
		System.out.println();
		System.out.println("Updated Account details are:");
		System.out.println();
		System.out.println("Account No.\tAccount Holder\tIntial Balance");
		System.out.println("_______________________________________________");
		System.out.println();
		System.out.println(person1.name+"\t\t"+account1.accNum+"\t"+account1.balance);
		System.out.println(person2.name+"\t\t"+account2.accNum+"\t"+account2.balance);
	}

}