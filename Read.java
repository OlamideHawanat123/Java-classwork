import java.util.Scanner;
public class Read{
	public static void main(String[] args){

	Scanner input = new Scanner(System.in);

	int naturalNumber = 0;

	for(int number = 1; number <= 10; number++){
		System.out.println(number);
		naturalNumber += number;
	}

	System.out.println("the sum of natural numbers are:" + naturalNumber);
	
	

	 

	}


}