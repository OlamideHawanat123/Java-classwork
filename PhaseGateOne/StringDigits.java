import java.util.Scanner;
public class StringDigits{

public static void main(String...args){ 
Scanner input = new Scanner(System.in);

System.out.print("Enter a number: ");
String number = input.nextLine();

for(int count = 0; count <= number; count++){
	if(count == number.length){
		System.out.print("True");
	}
else{
System.out.print("False");
}
}




}










}