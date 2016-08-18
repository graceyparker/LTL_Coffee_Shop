package master;

import java.text.NumberFormat;
import java.util.ArrayList;

public class Receipt {

	//pg. 375
	
	private ArrayList <LineItem> lineItems;
	
//the  constructor
	public Receipt(){
		lineItems = new ArrayList<>();
	}
	
	//a method that adds a line item
	
	public void addItem(LineItem lineItem){
		lineItems.add(lineItem);
	}
	
	//the get accessor for the line item collection
	
	public ArrayList<LineItem> getLineItems(){
		return lineItems;
		
	}
	
	//a method that gets the receipt total
	
	public double getTotal() {
		double receiptTotal = 0;
		for (LineItem lineItem : lineItems){
			receiptTotal += lineItem.getTotal();
		}
		return receiptTotal;
		
		}
//a method that returns the invoice total in currency format 
	public String getTotalFormatted() {
		NumberFormat currency = NumberFormat.getCurrencyInstance();
		return currency.format(getTotal());

}
}
