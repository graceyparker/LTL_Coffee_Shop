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
import java.util.InputMismatchException;
import java.util.Scanner;
public class CafeApp {
    public static void main(String[] args) {
        System.out.println("Welcome to LTL Coffee Shop!");
        System.out.println("-----------------------------");
        DecimalFormat df = new DecimalFormat();
        Scanner scan1 = new Scanner(System.in);
        Calculation calc = new Calculation();
        ArrayList<Product> cafeItems = new ArrayList<Product>();
        ArrayList<Product> receipt = new ArrayList<Product>();
        String fileName = "menu.txt";
        String userInput = " ";
        int userInputQuantity = 0;
        //double grandTotal = 0;
        Path filePath = Paths.get("menu.txt");
        File menuFile = filePath.toFile();
        // Payment pay = new Payment();
        readFile(menuFile);
        
        String choice = "yes";
        while (choice.equalsIgnoreCase("yes")) {
            // Product test = new Product();
//            Product product = new Product(null, null, 0.0);
            System.out
                    .println("Please Choose from the LTL Cafe Menu!  Enter 1 to 12.");
            cafeItems.add(new Product("1", "Caffe Americano", 5.00));
            cafeItems.add(new Product("2", "Caffe Latte", 5.00));
            cafeItems.add(new Product("3", "Caffe Mocha", 5.00));
            cafeItems.add(new Product("4", "Cappuccino", 5.00));
            cafeItems.add(new Product("5", "Caramel Macchino", 6.00));
            cafeItems.add(new Product("6", "Caramelized Honey Latte", 5.00));
            cafeItems.add(new Product("7", "Cinnamon Dolce Latte", 6.00));
            cafeItems.add(new Product("8", "Cheese Danish", 3.00));
            cafeItems.add(new Product("9", "Chewy Chocolate Cookie", 3.00));
            cafeItems.add(new Product("10", "Chocolate Chip Cookie", 3.00));
            cafeItems.add(new Product("11", "Chewy Chunk Muffin", 4.00));
            cafeItems.add(new Product("12", "Croissant", 3.00));
            
            userInput = scan1.nextLine();
           boolean found = false;
            for (int i = 0; i < cafeItems.size(); i++) {
                if (userInput.equalsIgnoreCase(cafeItems.get(i).getNumber())) {
                    System.out.print(cafeItems.get(i).getName() + "     $"
                    		+ "");                    
                    System.out.println(cafeItems.get(i).getItemPrice());
                    found = true;
                }
            }
            if (!found) {
                  System.out.println("this item does not exist");
                
continue;
// if you put the incorrect value, it will print the int again. 
            }
            System.out.println("How many would you like?");
            userInputQuantity = scan1.nextInt();
            scan1.nextLine();
            System.out.println("Your subtotal is $"   + calc.calculate(cafeItems.get(Integer.parseInt(userInput) - 1).getItemPrice(), userInputQuantity));
            System.out
                    .println("Would you like add another item to your order? Yes or no");
            choice = scan1.nextLine();
        }
        System.out.println("Your tax is: "
                + df.format(calc.calculate(cafeItems.get(Integer.parseInt(userInput) - 1)
                        .getItemPrice(), userInputQuantity) * 0.06));
        System.out.print("Thank you. Your total is: ");
        System.out.println(df.format(calc.calculateGrandTotal(cafeItems.get(Integer.parseInt(userInput) - 1).getItemPrice(),
                userInputQuantity)));
        
        
        double grandTotal = (calc.calculateGrandTotal(
                cafeItems.get(Integer.parseInt(userInput) - 1).getItemPrice(),
                userInputQuantity));
        
        System.out.println("How would you like to pay for your items? Cash, Credit, or Check?");
        String paymentInput = scan1.nextLine();
        
        
    //  while (paymentInput.equalsIgnoreCase("cash")|| paymentInput.equalsIgnoreCase("check")||paymentInput.equalsIgnoreCase("credit"))
        
        try {
        if (paymentInput.equalsIgnoreCase("cash")) {
            System.out.println("Please enter the amount tendered:");
            double payment = scan1.nextDouble();
            if (payment > grandTotal) {
                double changeDue = payment - grandTotal;
                System.out.println("Your change is: " + df.format(changeDue));
                System.out.println("Thank you for your order!\n\n");
            } else if (payment == grandTotal) {
                System.out.println("Thank you. Your order will  up soon");
            } else if (payment < grandTotal) {
                double amountDue = grandTotal - payment;
                System.out.println("You owe: " + amountDue);
            }
        } else if (paymentInput.equalsIgnoreCase("credit")){
                
            System.out.println("Please enter your eight digit credit card number:");
            int creditNumber = scan1.nextInt();
            String credNum = Integer.toString(creditNumber);
        //  if (credNum.length() == 8) {
        //  {System.out.println("Invalid number. Please eight digits.");}
            System.out.println("Please enter your expiration date as a four digit number (MMYY): ");
            int creditDate = scan1.nextInt();
            String credDate = Integer.toString(creditDate);
            System.out.println("Please enter the CVV number (the three digits on the back of your card: ");
            int creditCvv = scan1.nextInt();
            String credCvv = Integer.toString(creditCvv);
            System.out.println("Thank you for your order!");
        }
        else if (paymentInput.equalsIgnoreCase("check")) {
            System.out.println("Please enter your check number: ");
            int checkNumber = scan1.nextInt();
            String checkNum = Integer.toString(checkNumber);
            System.out.println("Thank you for order");
        }
        
        }
        catch (InputMismatchException e) {
            System.out.println("You have entered an invalid number. Your coffee is now free!");
            // the while loop with the try/catch would not stop looping-- infinite loop)
    
        
        }
        // {
    //      System.out.println("Invalid number. Please eight digits.");//it needs to loop back to the top. It doesn't.
        {   
  
      //it only adds the first item because it is not looping with the input for loop  	
      
       int i = 0;
      receipt.add(new Product(cafeItems.get(i).getName(), cafeItems.get(i).getItemPrice(), userInputQuantity));
         
      System.out.println("LTL Coffee Shop");
      System.out.println("================");
         for (i=0; i<receipt.size(); i++) {
        	 
             System.out.print("You order:  " + receipt.get(i).getName()+ "    ");
             System.out.print(receipt.get(i).getItemQty());
             System.out.println("        $" + receipt.get(i).getItemPrice());
             System.out.println("Tax:  $" + df.format(calc.calculate(cafeItems.get(Integer.parseInt(userInput) - 1)
                        .getItemPrice(), userInputQuantity) * 0.06));
             System.out.println("Grand Total:  $" + df.format(grandTotal));
             System.out.println();
             System.out.println("Thank you for your Business.");
         }
         
        }
    
} // End of main
    
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