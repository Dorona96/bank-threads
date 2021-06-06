package Q1;

import java.util.ArrayList;
/*
 * By: Doron Sharaby
 * Id: 204862197
 * 
 * A class representing the database of strays. The class will include an array of strays when all
 *A return includes an account number and an amount (positive or negative) 
 *that indicates the deposit or withdrawal to be made.
 * */

public class Stock{

	private ArrayList <Transaction> stock;

	public Stock(ArrayList <Transaction> stock) {
		this.stock = stock;
	}

	//works like FIFO
	public Transaction getTransaction() {
		if(stock.get(0)!= null) {
			Transaction currentT = stock.get(0);
			stock.remove(0);
			return currentT; 
		}
		return null; 

	}

}
