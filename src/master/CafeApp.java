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
import java.util.ArrayList;
import java.util.Scanner;

public class CafeApp {

public static void main(String[] args) {
	
	System.out.println("Welcome to LTL Coffee Shop!");
	System.out.println("-----------------------------");
	String fileName = "menu.txt";
	
	Path filePath = Paths.get("menu.txt");

	File menuFile = filePath.toFile();

	readFile(menuFile);
	
	
//	Product test = new Product();
	
	Product product = new Product(null, null, 0.0);
	
	System.out.println("Please Choose from the LTL Cafe Menu!  Enter 1 to 12.");
	Scanner scan1 = new Scanner(System.in);
	String userInput = scan1.nextLine();
	
		
ArrayList<Product> cafeItems = new ArrayList<Product>();

cafeItems.add(new Product("1", "Caffe Americano", 5.00));
cafeItems.add(new Product("2", "Caffe Latte", 5.00));
cafeItems.add(new Product("3", "Caffe Mocha", 5.00 ));
cafeItems.add(new Product("4", "Cappuccino", 5.00));
cafeItems.add(new Product("5", "Caramel Macchino", 6.00));

boolean found=false;
for(int i=0;i<cafeItems.size();i++){
	   if(userInput.equalsIgnoreCase(cafeItems.get(i).getNumber())){
		   System.out.println(cafeItems.get(i).getName());
		   System.out.println(cafeItems.get(i).getItemPrice());
		   found=true;
	   }	
}
if(!found){
	System.out.println("this item does not exist");


}





}//End of main 

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



}//End of Menu
//test.setName(userInput);
	//System.out.println(test.getName());
	
	
	
	
	//Product menuItem = new Product();
	
	//menuItem.setName(userInput);
	
	//System.out.println(menuItem.getName());
	