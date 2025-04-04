import java.util.Scanner;
public class GasMileage{
public static void main(String...args){

Scanner input = new Scanner(System.in);
int milesCounter = 0;
int gallonPerMilesCounter = 0;

System.out.println("Enter miles driven or enter -1 to quit:");
int miles = input.nextInt();

while(miles != -1){
System.out.println("Enter gallon used for the trip:");
int gallonPerMiles = input.nextInt();

System.out.println("Enter miles driven or enter -1 to quit:");
miles = input.nextInt();

milesCounter += miles;
gallonPerMilesCounter += gallonPerMiles;

}

double milesPerGallon = milesCounter / gallonPerMilesCounter;
System.out.println("The combined miles per gallon is:" + milesPerGallon);







}

}