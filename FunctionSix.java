import java.util.Scanner;
public class FuntionSix{
	public static void main(String...args){

	Scanner input = new Scanner(System.in);

	 System.out.print("Enter a five digits number:");
	int integer = input.nextInt();

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

	int result = isPalindrome(integer);
	System.out.print(result);
	}

	static boolean isPalindrome(int number){
	
			boolean one = true;
			boolean two = false;

			return one || two;
			}

	

	}