
import java.util.ArrayList;
import java.util.Random;
/*
 * By: Doron Sharaby
 * Id: 204862197
 * */

public class Bank {
	
	public static void main (String[] args) {
		
		Random rand = new Random();
		
		//5 account books with account numbers 0..4. Initialize the accounts with a balance of 0.
		ArrayList <Account> accounts = new ArrayList<>();
		//5 account books with account numbers 0..4. Initialize the accounts with a balance of 0.
		ArrayList <Account> accounts = new ArrayList<>();
		for(int i=0; i<10; i++) {
			accounts.add(new Account(i,0));		
		}
		
		ArrayList <Transaction> transactions = new ArrayList<>();
		for(int i=0; i<100;i++)
		{
			//transacions with strains for 5 accounts with deposits and withdrawals in the range of -1000 up to 1000.
			Transaction t= new Transaction(rand.nextInt(5),rand.nextInt(2000)-1000);
			transactions.add(t);
		}
		
		Stock stock = new Stock(transactions);
		ArrayList <Teller>  tellers= new ArrayList <>(); 
		
		//10 tellers who receive at the transaction to do.
		for(int i=0; i<10; i++) {
			tellers.add(new Teller(stock,accounts));
				
		}
		for(int i=0; i<10; i++) {	
			tellers.get(i).start();
				
		}
		
	}
	
}