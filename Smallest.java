import java.util.Scanner;
public class Smallest{
	public static void main(String...args){
	Scanner input = new Scanner(System.in);

	System.out.print("Enter a number:");
	int number1 = input.nextInt();

	System.out.print("Enter another number:");
	int number2 = input.nextInt();
	
	System.out.print("Enter another number:");
	int number3 = input.nextInt();
	
	int sum = number1 + number2 + number3;
	System.out.println("The sum is :" + sum);

	int average = sum / 3;
	System.out.println("The average is:" + average);

	int product = number1 * number2 * number3;
	System.out.println("The product is:" + product);




}








}