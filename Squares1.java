import java.util.Scanner;

public class Squares1{
	public static void main(String[] args){
	Scanner input = new Scanner(System.in);

	System.out.print("Enter first integer:");
	int integer1 = input.nextInt();

	System.out.print("Enter second integer:");
	int integer2 = input.nextInt();

	int squaredInteger1 = integer1 * integer1;
	int squaredInteger2 = integer2 * integer2;

	int sumOfSquares = squaredInteger1 + squaredInteger2;

	int differenceOfSquares = squaredInteger1 - squaredInteger2;

	System.out.println("The square of integer1 is:" + squaredInteger1);
	System.out.println("The square of integer2 is:" +  squaredInteger2);

	System.out.println("The sum of the two squares is:" + sumOfSquares);
	System.out.println("The difference of the two squares is:" + differenceOfSquares);


	}
}



