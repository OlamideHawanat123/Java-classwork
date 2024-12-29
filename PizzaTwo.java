import java.util.ArrayList;
public class Pizza{
	public static ArrayList<String> types(){

	ArrayList<String> pizzaTypes = new ArrayList<>();
 
	pizzaTypes.add("Sapa size");
	pizzaTypes.add("Small money");

	pizzaTypes.add("Big boys");
	pizzaTypes.add("Odogwu");

	return pizzaTypes;
	}

	public int slice(int number){
	return number;
	}

	public int price(int number){
	return number;
	}

	public int boxes(int numberOne, int numberTwo){ 
	return numberOne / numberTwo;
	}

	public int leftOver(int integerOne, int integerTwo, int integerThree){
	return integerOne * integerTwo - integerThree;
	}

	public int totalPrice(int numberOne, int numberTwo){
	return numberOne * numberTwo;
	}

	  }