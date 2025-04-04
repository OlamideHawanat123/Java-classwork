import java.util.HashMap;
import java.util.Map;
public class ExpenseTracker{

HashMap <String, Integer> expenses = new HashMap<>();
HashMap<String, String> expenseDescription = new HashMap<>();

public Map addExpense(int date, int amount){
	expenses.put("date", date);
	expenses.put("Amount", amount);
	return expenses;
	}

public Map addDescription(String description){
	expenseDescription.put("Description", description);
	return expenseDescription;
	}










}