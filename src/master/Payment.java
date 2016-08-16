package master;

import java.util.Scanner;

public class Payment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	//	public static receivePayment()
		Scanner scan1 = new Scanner(System.in);
		String paymentInput = scan1.nextLine();
		double grandTotal = 0;
			
		//	String paymentInput = "";
			
			
			if (paymentInput.equalsIgnoreCase("cash")) {
				System.out.println("Please enter the amount tendered:");
				double payment = scan1.nextDouble();
				if (payment > grandTotal){
					double changeDue = payment - grandTotal;
					System.out.println("Your change is: " + changeDue);
					}
				else if (payment == grandTotal){
					System.out.println("Thank you. Your order will up soon");
				}
				else if (payment < grandTotal){
					double amountDue = grandTotal - payment; 
					System.out.println("You owe: " + amountDue);
				}
			}
			else if (paymentInput.equalsIgnoreCase("credit")) {
				System.out.println("Please enter your credit card number:");
				String creditNumber = scan1.nextLine();
				System.out.println("Please enter your expiration date as a four digit number (00/00): ");
				String creditDate = scan1.nextLine(); 
				System.out.println("Please enter the CVV number (the three digits on the back of your card: ");
				String creditCvv = scan1.nextLine();
				System.out.println("Thank you for your order!");
					}
			
			else if (paymentInput.equalsIgnoreCase("check")){
				System.out.println("Please enter your check number: ");
				String checkNumber = scan1.nextLine();
				}
		}
	}


