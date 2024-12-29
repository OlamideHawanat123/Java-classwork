import java.util.ArrayList;
import java.util.Scanner;
public class PizzaFunctions{
	public static void main(String...args){

	Pizza input = new Pizza();
	Scanner scanner = new Scanner(System.in);

	ArrayList<String> pizzaTypes = input.types();
	System.out.println("Enter your preferred pizza type:");

	System.out.println(pizzaTypes);
	int types = scanner.nextInt();

	for(int count = 0; count < pizzaTypes.size(); count++);
	if(types == 1){
		int sliceResult = input.slice(4);
		int priceResult = input.price(2500);

	System.out.println("How many guests do you intend to serve?:");
	int guest = scanner.nextInt();

	int boxes = input.boxes(guest, sliceResult);
	if(guest % sliceResult != 0){
	boxes += 1;
	System.out.println("Number of boxes to buy is: " + boxes);
	}

	int leftOverResult = input.leftOver(boxes, sliceResult, guest);
	System.out.println("Number of leftover slices after serving is: " + leftOverResult);

	int totalResult = input.totalPrice(boxes, priceResult);
	System.out.println("The total price is: " + totalResult);

	}

	else if(types == 2){
		int sliceResult = input.slice(6);
		int priceResult = input.price(2900);

	System.out.println("How many guests do you intend to serve?:");
	int guest = scanner.nextInt();

	int boxes = input.boxes(guest, sliceResult);
	if(guest % sliceResult != 0){
	boxes += 1;
	System.out.println("Number of boxes to buy is: " + boxes);
	}

	int leftOverResult = input.leftOver(boxes, sliceResult, guest);
	System.out.println("Number of leftover slices after serving is: " + leftOverResult);

	int totalResult = input.totalPrice(boxes, priceResult);
	System.out.println("The total price is: " + totalResult);

	}

	else if(types == 3){
	int sliceResult = input.slice(8);
		int priceResult = input.price(4000);

	System.out.println("How many guests do you intend to serve?:");
	int guest = scanner.nextInt();

	int boxes = input.boxes(guest, sliceResult);
	if(guest % sliceResult != 0){
	boxes += 1;
	System.out.println("Number of boxes to buy is: " + boxes);
	}

	int leftOverResult = input.leftOver(boxes, sliceResult, guest);
	System.out.println("Number of leftover slices after serving is: " + leftOverResult);

	int totalResult = input.totalPrice(boxes, priceResult);
	System.out.println("The total price is: " + totalResult);
	}

	else if(types == 4){
		int sliceResult = input.slice(12);
		int priceResult = input.price(5200);

	System.out.println("How many guests do you intend to serve?:");
	int guest = scanner.nextInt();

	int boxes = input.boxes(guest, sliceResult);
	if(guest % sliceResult != 0){
	boxes += 1;
	System.out.println("Number of boxes to buy is: " + boxes);
	}

	int leftOverResult = input.leftOver(boxes, sliceResult, guest);
	System.out.println("Number of leftover slices after serving is: " + leftOverResult);

	int totalResult = input.totalPrice(boxes, priceResult);
	System.out.println("The total price is: " + totalResult);
	}


	



	
	

		
	

	
	
	

}
}