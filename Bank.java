package Q1;

import java.util.ArrayList;
import java.util.Random;
/*
 * By: Doron Sharaby
 * Id: 204862197
 * */

public class Bank {
	
	public static void main (String[] args) {
		
		Random rand = new Random();
		ArrayList <Account> accounts = new ArrayList<>();
		Account a0 = new Account (0,0);
		Account a1 = new Account (1,0);
		Account a2 = new Account (2,0);
		Account a3 = new Account (3,0);
		Account a4 = new Account (4,0);
		
		accounts.add(a0);
		accounts.add(a1);
		accounts.add(a2);
		accounts.add(a3);
		accounts.add(a4);
		
		ArrayList <Transaction> transactions = new ArrayList<>();
		for(int i=0; i<100;i++)
		{
			Transaction t= new Transaction(rand.nextInt(5),rand.nextInt(2000)-1000);
			transactions.add(t);
		}
		
		Stock stock = new Stock(transactions);
		Teller teller; 
		
		for(int i=0; i<10; i++) {
			teller= new Teller(stock,accounts);
			teller.start();
				
		}
		
	}
	
}