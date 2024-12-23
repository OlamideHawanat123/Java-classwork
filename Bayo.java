import java.util.Scanner;
public class Bayo{
	public static void main(String...args){

	Scanner scanner = new Scanner(System.in);

	System.out.print("Enter a number:");
	int number1 = scanner.nextInt();

	if(number1 >= 70){
	System.out.println("A");
	}

	else if(number1 >= 60){
	System.out.print("B");
	}

	else if(number1 >= 50){
	System.out.print("C");
	}

	else{
	System.out.println("Failed");
	System.out.print("Re-take the course");
}



	 }




}