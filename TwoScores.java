import java.util.Scanner;
public class TwoScores{
	public static void main(String...args){

Scanner entries = new Scanner(System.in);

	System.out.print("Enter first score:");
	int firstScore = entries.nextInt();

	System.out.print("Enter second score:");
	int secondScore = entries.nextInt();

	int sum = firstScore + secondScore;
	int average = sum / 2;

	if(firstScore > secondScore){
	System.out.println("The largest number is:" + firstScore);
	}

	else{
	System.out.print("The largest number is:" + secondScore);
	}

		
	System.out.println("The sum of the two scores is :" + sum);
	System.out.print("The average of the two scores is:" + average);



	}
}

