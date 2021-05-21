public class Deposit extends Transaction{
	double amount;
	public Deposit() {
		super();
	}
	public Deposit(int accountNum,double amount) {
		super(accountNum);
		this.amount = amount;
	}
	public Double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public void execute(double balance) {
		super.execute();
		balance=balance+amount;
		
		System.out.println("Balance : "+balance);
	}

}