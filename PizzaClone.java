import java.util.ArrayList;
import java.util.Scanner;
public class PizzaClone{
	public static void main(String...args){

	Scanner input = new Scanner(System.in);

	ArrayList<String> pizzaTypes = new ArrayList<>();

	pizzaTypes.add("Sapa size");
	

	pizzaTypes.add("Small money");

	pizzaTypes.add("Big boys");
	pizzaTypes.add("Odogwu");



	System.out.println("Enter your preferred pizza type in the following:");

	System.out.println(pizzaTypes);
	int type = input.nextInt();

	for(int count = 0; count < pizzaTypes.size(); count++);
	if(type == 1){

	int slice = 4;
	int pricePerBox = 2500;

	System.out.println("How many guests do you intend to serve?:");
	int guest = input.nextInt();
	
	int boxes = guest / slice;
	if(guest % slice != 0){
	boxes += 1;
	}

	int leftOver = guest % slice;

	int totalPrice = pricePerBox * boxes;
	System.out.println("Number of boxes to buy is: " + boxes);

	System.out.println("Number of leftOver slices after serving is: " + leftOver);
	System.out.println("Your total price is: " + totalPrice);
	}


}
}
