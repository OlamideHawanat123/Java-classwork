import java.util.Scanner;
public class FunctionThree{
	public static void main(String...args){

	Scanner input = new Scanner(System.in);

	System.out.print("Enter a number:");
	int number = input.nextInt();

	int result = square(number);
	System.out.print(result);

	

	}

	public static int square(int a){
	return a * a;
	}

}