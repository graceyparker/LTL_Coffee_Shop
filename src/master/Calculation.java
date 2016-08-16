package master;

import java.math.BigDecimal;
import java.text.DecimalFormat;


public class Calculation {
	
	

	
	public double calculate(double itemPrice, double quantity)
	{
		
		double Result;
		Result = itemPrice * quantity;
		return Result;
	}
	
	public double calculateGrandTotal(double itemPrice, double quantity)
	{
		
		/*BigDecimal Result;
		BigDecimal itemprice = new BigDecimal(itemPrice);
		BigDecimal qty = new BigDecimal(quantity);
		BigDecimal tax = new BigDecimal(1.06);
		
		Result = (itemprice.multiply(qty)).multiply(tax);
		Result.toString();
		return Result;
*/		
		
		//Result = BigDecimal.multiply()
		double Result;
		Result = (itemPrice * quantity)*1.06;
		return Result;
	}


}
