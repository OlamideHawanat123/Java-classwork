 import java.util.Scanner;
 public class LargestAndSmallestNumberr{
	public static void main(String...args){

	Scanner entries = new Scanner(System.in);

	System.out.println("Enter a number:");
	int smallest = entries.nextInt();

	System.out.println("Enter second number:");
	int integer2 = entries.nextInt();

	System.out.println("Enter third number:");
	int integer3 = entries.nextInt();

	if(integer2 < smallest){
	System.out.println(integer2 + "is the smallest number");
	}

	if(integer3 < smallest && integer3 < integer2){
	System.out.println(integer3 + "is the smallest");
	}

	else{
	System.out.print(smallest + "is the smallest number");
	}






	}


}