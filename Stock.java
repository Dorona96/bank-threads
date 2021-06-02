package Q1;

import java.util.ArrayList;


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


	public void add(Transaction t) {
		if(t!= null)
			stock.add(t);
	}



}
