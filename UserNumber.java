import java.util.Scanner;
public class UserNumber{
	public static void main(String...args){

	Scanner input = new Scanner(System.in);

	System.out.print("Enter a number:");
	int numberOne = input.nextInt();

	System.out.println("Enter second number:");
        int numberTwo = input.nextInt();

	System.out.print("Enter third number:");
	int numberThree = input.nextInt();

	System.out.print("Enter fourth number:");
	int numberFour = input.nextInt();

	int sum = numberOne + numberTwo + numberThree + numberFour;
	int average = sum / 4;

	int product = numberOne * numberTwo * numberThree * numberFour;

	int smallest = numberOne;
	int largest = numberOne;

	if(numberTwo < smallest){
	smallest = numberTwo;
	

	if(numberThree < smallest)
	smallest = numberThree;
	

	if(numberFour < smallest)
	smallest = numberFour;
	}
	


	if(numberTwo > largest){
	largest = numberTwo;
	

	if(numberThree > largest)
	largest = numberThree;
	

	if(numberFour > largest)
	largest = numberFour;
	}
	

	System.out.println("The sum is:" + sum);
	System.out.println("The average is:" + average);
	System.out.println("The product is:" + product);

	System.out.println("The smallest is:" + smallest);
	System.out.println("The largest is:" + largest);	








	}




}