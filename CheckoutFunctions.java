import java.util.Scanner;
public class CheckoutFunctions{
	public static void main(String...args){
	Scanner scanner = new Scanner(System.in);
	Checkout input = new Checkout();

	System.out.println("What is your the customer's name:");
	String name = scanner.nextLine();

	System.out.println("What did the user buy:");
	String product = scanner.nextLine();

	System.out.println("How many pieces:");
	int pieces = scanner.nextInt();

	System.out.println("How much per unit:");
	int price = scanner.nextInt();

	System.out.println("Add more items?(Enter y/n):");
	String moreProduct = scanner.next ();

	input.name();

	
	

	

	

}



}