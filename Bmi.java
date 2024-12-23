import java.util.Scanner;
public class Bmi{
	public static void main(String... args){
Scanner input = new Scanner(System.in);

System.out.print("Enter a number:");
int weightInPounds = input.nextInt();

System.out.print("Enter another number:");
int heightInInches = input.nextInt();

double weightInKilogram = weightInPounds * 0.45359237;
double heightInMeters = heightInInches * 0.0254;

double squaredHeightInMeter = heightInMeters * heightInMeters;
double bodyMassIndex = weightInKilogram / squaredHeightInMeter;

System.out.print("The body mass index is:" + bodyMassIndex);
	}
} 




 
