package master;

public class Product {


	private String Name;
	private String Category;
	private double Price;
	
	
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getCategory() {
		return Category;
	}
	public void setCategory(String category) {
		Category = category;
	}
	
	public double getPrice() {
		return Price;
	}
	public void setPrice(double price) {
		Price = price;
	}
	public Product(String name, String category, String description,
			double price) {
		super();
		setName(name);
		setCategory(category);
		setPrice(price);
	}
}
	

