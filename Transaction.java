package Q1;

public class Transaction{

	private double amount;
	private int accountNum;
	
	public Transaction(int accountNum, double amount)
	{
		this.amount = amount;
		this.accountNum = accountNum;
	}
	
	public double getAmount(){		return amount;	}
	public int getAccountNum(){		return accountNum;	}
	
}
