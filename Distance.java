import java.util.Scanner;
public class Distance{
	public static void main(String...a){

	Scanner input = new Scanner (System.in);

	System.out.print("Enter a number in distance to drive:");
	int distance = input.nextInt();

	System.out.print("Enter a number in miles per gallon:");
	int milesPerGallon = input.nextInt();

	System.out.print("Enter a number in price per gallon:");
	int pricePerGallon = input.nextInt();

	int costOfTheTrip = (distance * pricePerGallon) / milesPerGallon;

	System.out.println("The cost of the trip is:" + costOfTheTrip);

	System.out.print("The cost of the trip is:" + costOfTheTrip);

	System.out.printf("%s %d", "The cost of the trip is:", costOfTheTrip);





	}
}