import java.util.Scanner;
public class Comparison{
	public static void main(String... args){

Scanner input = new Scanner(System.in);

System.out.print("Enter a number:");
int number1 = input.nextInt();

int squaredNumber = number1 * number1;
System.out.println("the squared number is: " + squaredNumber);

if(number1 > 100){
System.out.println("number1 is greater than 100");
}   

else if(number1 == 100){
System.out.println("number1 is equal to 100");
}

else if(number1 != 100){
System.out.println("number1 is not equal to 100");
}

else if(number1 < 100){
System.out.println("number1 is less than 100");
}

if(squaredNumber > 100){
System.out.println("squaredNumber is greater than 100");
}   

else if(squaredNumber == 100){
System.out.println("squaredNumber is equal to 100");
}

else if(squaredNumber != 100){
System.out.println("squaredNumber is not equal to 100");
}

else if(squaredNumber < 100){
System.out.println("squaredNumber is less than 100");
}


	}

}







