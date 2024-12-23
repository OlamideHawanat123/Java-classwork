import java.util.Scanner;
	public class Palindrome{
	public static void main(String...args){

	Scanner scanner = new Scanner(System.in);

	System.out.print("Enter a three digits number:");
	int threeDigits = scanner.nextInt();

	int lastDigit = threeDigits % 10;
	int twoDigits = threeDigits / 10;

	int secondDigit = twoDigits % 10;
	int firstDigit 	= twoDigits / 10;

	if(lastDigit == firstDigit ){
	System.out.println("this is a palindrome");
	}
	else{
	System.out.println("this is not a palindrome");
	}
		

		}
	}
