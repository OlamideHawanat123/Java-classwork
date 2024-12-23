import java.util.Scanner;
public class FunctionTwo{
	public static void main(String[] args){
	Scanner entries = new Scanner(System.in);

	System.out.print("Enter a number:");
	int numberOne = entries.nextInt();

	System.out.print("Enter another number:");
	int numberTwo = entries.nextInt();
	
	int result = quotient(numberOne, numberTwo);
	System.out.print(result);

	if(numberTwo == 0){
	System.out.print("0");
	}

	}

	public static int quotient(int a, int b){
	return a / b;
	}



}