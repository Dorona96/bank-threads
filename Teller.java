import java.util.ArrayList;
/*
 * By: Doron Sharaby
 * Id: 204862197
 * */

public class Teller extends Thread{
	private Stock stock;
	private ArrayList<Account> accounts;
	
	public Teller(Stock stock, ArrayList<Account> accounts ) {
		this.stock = stock;
		this.accounts = accounts;
	}

	@Override
	public void run() {
		try {
			sleep(rand.nextInt(999));
		}catch (InterruptedException e){
			System.out.println("Was sleeping and now awake!");
		}
		Transaction temp =stock.getTransaction();
		while(temp!=null) {
			Account account= accounts.get(temp.getAccountNum());
			account.transaction(temp.getAmount());
			temp =stock.getTransaction();
		}
	}
}

