import java.util.ArrayList;
import java.util.Scanner;
public class Pizza{
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
	int leftOver = boxes * slice - guest;

	int totalPrice = pricePerBox * boxes;
	System.out.println("Number of boxes to buy is: " + boxes);

	System.out.println("Number of leftOver slices after serving is: " + leftOver);
	System.out.println("Your total price is: " + totalPrice);
	}

	else if(type == 2){

	int slice = 6;
	int pricePerBox = 2900;

	System.out.println("How many guests do you intend to serve?:");
	int guest = input.nextInt();
	
	int boxes = guest / slice;
	if(guest % slice !=0){
	boxes +=1;
	}

	int leftOver = boxes * slice - guest;

	int totalPrice = pricePerBox * boxes;
	System.out.println("Number of boxes to buy is: " + boxes);

	System.out.println("Number of leftOver slices after serving is: " + leftOver);
	System.out.println("Your total price is: " + totalPrice);
	}


	else if(type == 3){

	int slice = 8;
	int pricePerBox = 4000;

	System.out.println("How many guests do you intend to serve?:");
	int guest = input.nextInt();
	
	int boxes = guest / slice;
	if(guest % slice !=0){
	boxes +=1;
	}

	int leftOver = boxes * slice - guest;

	int totalPrice = pricePerBox * boxes;
	System.out.println("Number of boxes to buy is: " + boxes);

	System.out.println("Number of leftOver slices after serving is: " + leftOver);
	System.out.println("Your total price is: " + totalPrice);
	}

	else if(type == 4){

	int slice = 12;
	int pricePerBox = 5200;

	System.out.println("How many guests do you intend to serve?:");
	int guest = input.nextInt();
	
	int boxes = guest / slice;
	if(guest % slice !=0){
	boxes +=1;
	}

	int leftOver = boxes * slice - guest;

	int totalPrice = pricePerBox * boxes;
	System.out.println("Number of boxes to buy is: " + boxes);

	System.out.println("Number of leftOver slices after serving is: " + leftOver);
	System.out.println("Your total price is: " + totalPrice);
	}

	else{
	System.out.print("Programme terminated");
	}

	


	
	













} 

}







