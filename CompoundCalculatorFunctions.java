import java.util.Scanner;
public class CompoundCalculatorFunctions{
	public static void main(String...args){

	CompoundCalculator input = new CompoundCalculator();
	Scanner scanner = new Scanner(System.in);

	System.out.print("What is the amount of money you have available to invest initially: ");
	double firstInvestment = scanner.nextDouble();

	double initial = input.initialInvestment(firstInvestment);
	System.out.print("What is theamount you plan to add to the principal every month: ");
	double monthly = scanner.nextDouble();

	double monthlyContribution = input.monthlyContribution(monthly);
	System.out.print("What is the length of time, in years, that you plan to save: ");

	int year = scanner.nextInt();
	int time = input.timeInYear(year);

	int interest = input.interestRate(5);
	double lastInterest = input.finterestRate(interest);

	
	
		
	}


}