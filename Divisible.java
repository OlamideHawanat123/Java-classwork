import java.util.Scanner;
public class Divisible{
	public static void main(String...args){

Scanner input = new Scanner(System.in);

System.out.print("Enter a number:");
int number1 = input.nextInt();

if(number1 % 3 == 0){
System.out.print("number1 is divisible by 3");

if(number1 % 3 != 0){
System.out.print("number1 is not divisible by 3");
}
} 
	}
}
