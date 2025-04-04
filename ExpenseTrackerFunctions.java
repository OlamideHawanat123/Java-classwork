import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

public class ExpenseTrackerFunctions{
public static void main(String...args){

Scanner scanner = new Scanner(System.in);
ExpenseTracker input = new ExpenseTracker();

HashMap<String, Integer> expenses = new HashMap<>();
HashMap<String, String> expenseDescription = new HashMap<>();


System.out.print("Enter date in this format(YYYY-MM-DD): ");
int date = scanner.nextInt();

System.out.print("Enter the amount: ");
int amount = scanner.nextInt();


expenses = input.addExpense("Date", date);
amount = input.addExpense("Amount", amount);
}
}
