import java.util.Scanner;
public class TemiLargest{
	public static void main(String[] args){

	Scanner input = new Scanner(System.in);

	System.out.print("Enter first number:");
	int firstNumber = input.nextInt();

	System.out.print("Enter second number:");
	int secondNumber = input.nextInt();

	System.out.print("Enter third number:");
	int thirdNumber = input.nextInt();

	System.out.print("Enter fourth number:");
	int fourthNumber = input.nextInt();

	System.out.print("Enter fifth number:");
	int fifthNumber = input.nextInt();

	if(firstNumber > secondNumber && firstNumber > thirdNumber && firstNumber > fourthNumber && firstNumber > fifthNumber);
	System.out.print(firstNumber + "is the largest");
	

	if(secondNumber > firstNumber && secondNumber > thirdNumber && secondNumber > fourthNumber && secondNumber > fifthNumber);
	System.out.print("the largest number is" + secondNumber);
	 

	if(thirdNumber > firstNumber && thirdNumber > secondNumber && thirdNumber > fourthNumber && thirdNumber > fifthNumber);
	System.out.print("the largest number is" + thirdNumber);
	

	if(fourthNumber > firstNumber && fourthNumber > secondNumber && fourthNumber > thirdNumber && fourthNumber > fifthNumber);
	System.out.print("the largest number is" + fourthNumber);
	
	
	if(fifthNumber > firstNumber && fifthNumber > secondNumber && fifthNumber > thirdNumber && fifthNumber > fourthNumber);
	System.out.print("The largest number is" + fifthNumber);
	




	}

}

	
 




