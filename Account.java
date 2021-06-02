package Q1;
public class Account {

	private int number;
	private int balance;



	public Account(int number, int balance){
		this.balance = balance; 
		this.number = number; 

	}

	public  synchronized int getBalance() {	return balance; }

	public synchronized int getNumber() {	return number; }

	public synchronized void transaction(double amount) {
		System.out.println("account:"+number+", transaction= " + amount);
		if(amount<0) {

			if (balance + amount< 0) 
			{
				while(balance + amount< 0) {
					try{
						System.out.println("account number "+number+"  is waiting");
						wait(); //wait for money
						
					} catch(InterruptedException ie) {
						System.err.println(ie.getMessage());
					}
				}	
			}
		}
		int temp = balance;
		temp += amount; 

		try {
			Thread.sleep(200); // simulate consumption time
		}catch(InterruptedException ie) {
			System.err.println(ie.getMessage());
		}
		System.out.println("account:"+number+", after balance = " + temp);
		balance = temp;
		notify();
	}
}
