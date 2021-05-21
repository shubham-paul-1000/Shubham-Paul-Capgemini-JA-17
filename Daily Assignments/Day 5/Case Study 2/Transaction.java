public class Transaction {
	private int accountNumber;
	public Transaction() {}
	public Transaction(int accountNumber)
	{
		this.accountNumber=accountNumber;
	}
	public int getAccountNumber()
	{
		return accountNumber;
	}
	public void execute()
	{
		System.out.println("Account Number = "+accountNumber);
	}
}
