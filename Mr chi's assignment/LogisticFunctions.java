import java.util.Scanner;
public class LogisticFunctions{

	public static void main(String...args){

	Logistics input = new Logistics();
	Scanner scanner = new Scanner(System.in);

	System.out.print("Enter number of successful deliveries:");
	int delivery = scanner.nextInt();

	int riderpay = input.noOfDelivery(delivery);
	System.out.println("Your wage is: " + riderpay);

	









}


}