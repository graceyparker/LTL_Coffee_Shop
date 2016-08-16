package master;

import java.util.Scanner;

public class Product {

	private String Name;
	private String Category;
	private double itemPrice;
	Scanner scan1 = new Scanner(System.in);
	String userInput = scan1.nextLine();
	
	int userInputQty = scan1.nextInt();	
	//scan1.nextLine();
	

	int userInputPrice = scan1.nextInt();

	
	
	public String getName() {
		return Name;
	}
	
	
	

	public Product() {
		super();
	}




	public Product(String userInput) {
		super();
		this.userInput = userInput;
	}




	public Product(String name, double itemPrice) {
		super();
		Name = name;
		this.itemPrice = itemPrice;
	}




	public Product(String name, String category, double itemPrice, Scanner scan1, String userInput) {
		super();
		Name = name;
		Category = category;
		this.itemPrice = itemPrice;
		this.scan1 = scan1;
		this.userInput = userInput;
	}




	public void setName(String name) {
		if (userInput.equalsIgnoreCase("1")) {
			name = "Caffe Americano";
		} else if (userInput.equalsIgnoreCase("2")) {
			name ="Caffe Latte";
		} else if (userInput.equalsIgnoreCase("3")) {
			name = "Caffe Mocha";
		} else if (userInput.equalsIgnoreCase("4")) {
			name ="Cappuccino";
		} else if (userInput.equalsIgnoreCase("5")) {
			name = "Caramel Macchiato";
		} else if (userInput.equalsIgnoreCase("6")) {
			name = "Caramelized Honey Latte";
		} else if (userInput.equalsIgnoreCase("7")) {
			name = "Cinnamon Dolce Latte";
		} else if (userInput.equalsIgnoreCase("8")) {
			name = "Cheese Danish";
		} else if (userInput.equalsIgnoreCase("9")) {
			name = "Chocolate Chip Cookie";
		} else if (userInput.equalsIgnoreCase("10")) {
			name = "Chocolate Chip Cookie";
		} else if (userInput.equalsIgnoreCase("11")) {
			name = "Chocolate Chunk Muffin";
		} else if (userInput.equalsIgnoreCase("12")) {
			name = "Chocolate Croissant";
		} else { System.out.println("Invalid selection. Please select from 1 - 12.");}
	
		Name = name;
	System.out.println(Name);
	
	}

	public double getItemPrice() {
		return itemPrice;
	}

	public void setItemPrice(double itemPrice) {
		if (userInputPrice == 1) {
			itemPrice = 5.00;
		} else if (userInputPrice == 2) {
			itemPrice = 5.00;
		} else if (userInputPrice == 3) {
			itemPrice = 5.00;
		} else if (userInputPrice == 4) {
			itemPrice = 5.00;
		} else if (userInputPrice == 5) {
			itemPrice = 6.00;
		} else if (userInputPrice == 6) {
			itemPrice = 5.00;
		} else if (userInputPrice == 7) {
			itemPrice = 3.00;
		} else if (userInputPrice == 8) {
			itemPrice = 3.00;
		} else if (userInputPrice == 9) {
			itemPrice = 4.00;
		} else if (userInputPrice == 10) {
			itemPrice = 3.00;
		} else if (userInputPrice == 11) {
			itemPrice = 4.00;
		} else if (userInputPrice == 12) {
			itemPrice = 4.00;
		} else { System.out.println("Invalid selection. Please select from 1 - 12.");}
		
	}

	public String getCategory() {
		return Category;
	}
/*
	public void setCategory(String category) {
		Category = category;
		if (userInput == 1) {
			category = "Drink";
		} else if (userInput == 2) {
			category = "Drink";
		} else if (userInput == 3) {
			category = "Drink";
		} else if (userInput == 4) {
			category = "Drink";
		} else if (userInput == 5) {
			category = "Drink";
		} else if (userInput == 6) {
			category = "Drink";
		} else if (userInput == 7) {
			category = "Drink";
		} else if (userInput == 8) {
			category = "Food";
		} else if (userInput == 9) {
			category = "Food";
		} else if (userInput == 10) {
			category = "Food";
		} else if (userInput == 11) {
			category = "Food";
		} else if (userInput == 12) {
			category = "Food";
		} else { System.out.println("Invalid selection. Please select from 1 - 12.");}
		
	}
*/
	public Product(String name, String category, double itemPrice) {
		super();
		setName(name);
		//setCategory(category);
		setItemPrice(itemPrice);
	}
	
	public Product() {
		super();
	}
	
	
	public void getUserInput(){
		
	System.out.println("You've selected: " + getName());
	System.out.println("The price is: " + getItemPrice());
		
	}
	
	

}
