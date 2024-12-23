import java.util.Scanner;
	public class IntegerSum{
	public static void main(String...args){

	Scanner scanner = new Scanner(System.in);

	System.out.print("Enter a three digits number between 0 and 1000:");
	int threeDigits = scanner.nextInt();

	int lastDigit = threeDigits % 10;
	int twoDigits = threeDigits / 10;

	int secondDigit = twoDigits % 10;
	int firstDigit 	= twoDigits / 10;

	int sum = lastDigit + secondDigit + firstDigit;

	System.out.print("The sum is:" + sum);

 



}

}