import java.util.Scanner;
public class Average{
	public static void main(String... ars){

Scanner input = new Scanner(System.in);

System.out.print("Enter first number:");
int number1 = input.nextInt();

System.out.print("Enter second number:");
int number2 = input.nextInt();

System.out.print("Enter third number:");
int number3 = input.nextInt();

int sum = number1 + number2 + number3;
System.out.println("The sum is:" + sum);

int average = (sum/3);
System.out.println("The average is:" + average);

int product = number1 * number2 * number3;
System.out.println("The product is:" + product);

if(number1 < number2 && number1 < number3){
System.out.println(number1 + " is the smallest");
}

else if(number2 < number1 && number2 <number3){
System.out.println(number2 + " is the smallest");
}

else {
System.out.println(number3 + " is the smallest");
}

if(number1 > number2 && number1 > number3){
System.out.print("number1 is the largest");
}
else if(number2 > number1 && number2 > number3){
System.out.print(number2 + " is the largest");
}
else {
System.out.print(number3 + " is the largest");
}

	}
}

