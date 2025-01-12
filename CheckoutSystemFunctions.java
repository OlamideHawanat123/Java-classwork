import java.util.*;
public class CheckoutSystemFunctions{

	public static void main(String...args){
	Scanner input = new Scanner(System.in);

	ArrayList<String> product = new ArrayList<>();
	ArrayList<Integer> pieces = new ArrayList<>();

	ArrayList<Float> price = new ArrayList<>();
	
	float totalPrice = 0;
	int total;
	
	System.out.println("What is the customer's name");
	String customerName = input.nextLine();

	String question;

	do{
	System.out.println("What did the user buy:");
	String item = input.nextLine();
	product.add(item);

	System.out.println("How many pieces:");
	int quantity = input.nextInt();
	pieces.add(quantity);

	System.out.println("How much per unit");
	float unitPrice = input.nextFloat();
	price.add(unitPrice);

	for(int count = 0; count < Price.size(); count++)
	 total = quantity * price(count);
	totalPrice += total;

	System.out.println("Add more items?(Enter yes/no):");
	question = input.nextLine();

	totalPrice =+ unitPrice;
	}while(question.equalsIgnoreCase("Yes"));

	System.out.println("What is cashier's name");
	String cashierName = input.nextLine();

	System.out.println("How much discount wil he get?:");
	int discountPercentage = input.nextInt();
	int discount = totalPrice * (discountPercentage / 100);

	



	

	



	

	

	

	
	
	

	
	



	






























}


}