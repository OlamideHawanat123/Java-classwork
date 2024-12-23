import java.util.Scanner;
public class CollectTwoNumbers{
	public static void main(String...ola){

	Scanner input = new Scanner(System.in);

	System.out.print("Enter a number:");
	int numberOne = input.nextInt();

	System.out.print("Enter another number:");
	int numberTwo = input.nextInt();

	int sum = numberOne + numberTwo;

	if(sum > 100)System.out.println(sum + "is greater than 100");
	else if(sum < 100)System.out.println(sum + "is lesser than 100");

			
	}
}