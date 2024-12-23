import java.util.Scanner;
public class SumOfEvenAndOddNumbers{
	public static void main(String[] a){

Scanner userinput = new Scanner(System.in);
		
	for(int integer = 1; integer < 51; integer++){
	System.out.println(integer);

	if(integer++ % 10 == 0){
	System.out.print(integer);
	}

	}


	}
}