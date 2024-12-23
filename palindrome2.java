import java.util.Scanner;
public class Palinrome2{
	public static void main(String...ars){

Scanner input = new Scanner(System.in);

	System.out.print("Enter five- digits number");
	int numberOne = input.nextInt();

	int lastDigit = numberOne % 10;
	int fourNumbers = numberOne / 10;

	int fourthDigit = fourNumbers % 10;
	int thirdNumbers =  fourNumbers / 10;

	int thirdDigit = thirdNumbers % 10;
	int twoNumbers = thirdNumbers / 10;

	int secondDigit = twoNumbers % 10;
	int firstDigit = twoNumbers / 10;

	if(lastDigit == firstDigit && lastDigit == thirdDigit && secondDigit == fourthDigit){
	System.out.print(numberOne + "is a palindrome");
	}

	else{
	System.out.print(numberOne + "is not a palindrome");
}


	}
}




 



