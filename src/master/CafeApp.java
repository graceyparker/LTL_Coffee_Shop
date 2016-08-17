//in order to keep track of the items after every order we need an another array list

package master;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Scanner;

public class CafeApp {

	public static void main(String[] args) {

		System.out.println("Welcome to LTL Coffee Shop!");
		System.out.println("-----------------------------");
		String fileName = "menu.txt";

		int userInputQuantity = 0;
		String userInput = " ";
		// double grandTotal = 0;
		ArrayList<Product> cafeItems = new ArrayList<Product>();
		ArrayList<Product> countingCafe = new ArrayList<Product>();
		ArrayList<Product> keepingCafe = new ArrayList<Product>();
		DecimalFormat df = new DecimalFormat();
		Scanner scan1 = new Scanner(System.in);
		String userInput1 = " ";

		Path filePath = Paths.get("menu.txt");

		File menuFile = filePath.toFile();
		Calculation calc = new Calculation();
	//	Product orderedProduct = new Product(null, 0.0, 0);
		ArrayList<Product> ordered = new ArrayList();
		String orderedCafeitem = null;
		double orderedItemPrice = 0;

		// Payment pay = new Payment();

		// double subtotal =

		String choice = "yes";
		while (choice.equalsIgnoreCase("yes")) {

			readFile(menuFile);

			// Product test = new Product();

			Product product = new Product(null, null, 0.0);

			System.out.println("Please Choose from the LTL Cafe Menu!  Enter 1 to 12.");
			userInput = scan1.nextLine();

			cafeItems.add(new Product("1", "Caffe Americano", 5.00));
			cafeItems.add(new Product("2", "Caffe Latte", 5.00));
			cafeItems.add(new Product("3", "Caffe Mocha", 5.00));
			cafeItems.add(new Product("4", "Cappuccino", 5.00));
			cafeItems.add(new Product("5", "Caramel Macchino", 6.00));

			boolean found = false;
			for (int i = 0; i < cafeItems.size(); i++) {
				if (userInput.equalsIgnoreCase(cafeItems.get(i).getNumber())) {

<<<<<<< HEAD
=======
					orderedCafeitem = cafeItems.get(i).getName();
>>>>>>> e2e414f6a6c5220a906c96aa96d72788e2d652d7
					System.out.println(cafeItems.get(i).getName());
					orderedItemPrice = cafeItems.get(i).getItemPrice();
					System.out.println(cafeItems.get(i).getItemPrice());
					ordered.add(new Product(orderedCafeitem, orderedItemPrice, userInputQuantity));
					found = true;

				}
			}
			if (!found) {
				System.out
						.println("This item does not exist. "
								+ "Please Choose from the LTL Cafe Menu!  Enter 1 to 12.");
				System.out.println();

				// continue; //try catch can be placed here
				 break;

			}

			System.out.println("How many would you like?");
			userInputQuantity = scan1.nextInt();
			scan1.nextLine();

			System.out.println("Your subtotal is $"
					+ calc.calculate(cafeItems.get(Integer.parseInt(userInput) - 1).getItemPrice(), userInputQuantity));

			// ordered.add(new Product(orderedCafeItem, );

			System.out.println("Would you like add another item to your order? Yes or no");
			choice = scan1.nextLine();

		}

<<<<<<< HEAD
		System.out.println("Your tax is: "
				+ df.format(calc.calculate(
						cafeItems.get(Integer.parseInt(userInput) - 1)
								.getItemPrice(), userInputQuantity) * 0.06));
=======
		System.out.println("Your tax is: " + df
				.format(calc.calculate(cafeItems.get(Integer.parseInt(userInput) - 1).getItemPrice(), userInputQuantity)
						* 0.06));
>>>>>>> e2e414f6a6c5220a906c96aa96d72788e2d652d7
		System.out.print("Thank you. Your total is: ");
		System.out.println(df.format(calc.calculateGrandTotal(
				cafeItems.get(Integer.parseInt(userInput) - 1).getItemPrice(), userInputQuantity)));

<<<<<<< HEAD
		double grandTotal = (calc.calculateGrandTotal(
				cafeItems.get(Integer.parseInt(userInput) - 1).getItemPrice(),
				userInputQuantity));

		System.out
				.println("How would you like to pay for your items? Cash, Credit, or Check?");
=======
		double grandTotal = (calc.calculateGrandTotal(cafeItems.get(Integer.parseInt(userInput) - 1).getItemPrice(),
				userInputQuantity));

		System.out.println("How would you like to pay for your items? Cash, Credit, or Check?");
>>>>>>> e2e414f6a6c5220a906c96aa96d72788e2d652d7
		String paymentInput = scan1.nextLine();
		if (paymentInput.equalsIgnoreCase("cash")) {
			System.out.println("Please enter the amount tendered:");
			double payment = scan1.nextDouble();
			if (payment > grandTotal) {
				double changeDue = payment - grandTotal;
				System.out.println("Your change is: " + changeDue);
				System.out.println("Thank you for your order!");
			} else if (payment == grandTotal) {
				System.out.println("Thank you. Your order will be up soon");
			} else if (payment < grandTotal) {
				double amountDue = grandTotal - payment;
				System.out.println("You owe: " + amountDue);
			}
		} else if (paymentInput.equalsIgnoreCase("credit")) {
			System.out.println("Please enter your credit card number:");
			String creditNumber = scan1.nextLine();
			System.out.println("Please enter your expiration date as a four digit number (00/00): ");
			String creditDate = scan1.nextLine();
			System.out.println("Please enter the CVV number (the three digits on the back of your card: ");
			String creditCvv = scan1.nextLine();
			System.out.println("Thank you for your order!");
		}

		else if (paymentInput.equalsIgnoreCase("check")) {
			System.out.println("Please enter your check number: ");
			String checkNumber = scan1.nextLine();
			System.out.println("Thank you. Your order will arrive soon.");
		}

		for (int i = 0; i < ordered.size(); i++) {

			System.out.println(ordered.get(i).getName());
			System.out.println(ordered.get(i).getItemPrice());
			System.out.println(ordered.get(i).getItemQty());

		}

	}// End of main

	public static void readFile(File myConfigFile) {
		try {
			FileReader reader = new FileReader(myConfigFile);

			BufferedReader bReader = new BufferedReader(reader);

			String newLine = bReader.readLine();

			while (newLine != null) {
				System.out.println(newLine);

				newLine = bReader.readLine();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {

		}
	}

}