 import java.util.Scanner;
public class Squares{
	public static void main(String[] args){

Scanner input = new Scanner(System.in);

System.out.print("Enter a number in square meter:");
int number1 = input.nextInt();

double ping = number1 * 0.3025;
System.out.print("Ping is:" + ping);
	}
}
