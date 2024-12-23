import java.util.Scanner;
public class CollectNames{
	public static void main(String...args){

Scanner userInput = new Scanner(System.in);

	System.out.print("Enter your first name:");
	String firstName = userInput.nextLine();

	System.out.print("Enter your lastName:");
	String lastName = userInput.nextLine();

	System.out.printf("%s %s %s", "Good evening", firstName, lastName);



	}
}

