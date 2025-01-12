import java.util.ArrayList;
public class PizzaOrderApp{

	public ArrayList<String> pizzaTypes(){
	ArrayList<String> types = new ArrayList<>();

	types.add("Sapa size");
	types.add("Small money");

	types.add("Big money");
	types.add("Odogwu");

	return types;
	}

	public ArrayList<Integer> pizzaPrices(){
	ArrayList<Integer> price = new ArrayList<>();

	price.add(2500);
	price.add(2900);

	price.add(4000);
	price.add(5200);
	}
	
	for(int count = 0; count < types.size() && count < price.size(); count++);
	return count;
	













}