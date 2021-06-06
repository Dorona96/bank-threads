package Q1;
/*
 * By: Doron Sharaby
 * Id: 204862197
 * 
 * Account class in the bank. The department contains an account number and a balance
 * 
 * */
public class Account {

	private int number;
	private int balance;



	public Account(int number, int balance){
		this.balance = balance; 
		this.number = number; 

	}

	public  synchronized int getBalance() {	return balance; }

	public synchronized int getNumber() {	return number; }

	/*Transaction method that allows you to make deposits and withdrawals. The method is given a representative parameter
	 *The amount of the operation when a positive value in the parameter indicates the amount of the deposit and a negative value indicates
	 * The amount of withdrawal.
	 * */
	public synchronized void transaction(double amount) {
		System.out.println("account:"+number+", transaction= " + amount);
		if(amount<0) {

			if (balance + amount< 0) 
			{
				while(balance + amount< 0) {
					//Execution that delay tellers who dissolve to make an attraction that will cause the formation
					//	Negative balance, which means that it will make sure that the account is not covered by the obligation.
					synchronized(this) {
						try{
							System.out.println("account number "+number+"  is waiting");
							wait(); //wait for deposit >= amount

						} catch(InterruptedException ie) {
							System.err.println(ie.getMessage());
						}
					}
				}	
			}
			System.out.println("account number "+number+"  stoped waiting");
		}
		int temp = balance;
		temp += amount; 

		try {
			Thread.sleep(100); // simulate consumption time
		}catch(InterruptedException ie) {
			System.err.println(ie.getMessage());
		}
		System.out.println("account:"+number+", after balance = " + temp);
		balance = temp;
		notify();
	}
}
