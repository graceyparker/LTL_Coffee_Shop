package master;
import java.text.NumberFormat;

public class LineItem {
//pg. 141
	private Product product;
	private int itemQty;
	
	public LineItem(){
		this.product = null;
		this.itemQty = 0;
	}

	public LineItem(Product product, int itemQty) {
		super();
		this.product = product;
		this.itemQty = itemQty;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public int getQuantity() {
		return itemQty;
	}

	public void setQuantity(int itemQty) {
		this.itemQty = itemQty;
	}
	
	public double getTotal(){
		double total = itemQty * product.getItemPrice();
		return total;
	}
	
	public String getTotalFormatted(){
		double total = this.getTotal();
		NumberFormat itemPrice = NumberFormat.getCurrencyInstance();
		String totalFormatted = itemPrice.format(total);
		return totalFormatted;
	}
	
	
	}
	
	
	

