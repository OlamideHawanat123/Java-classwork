import java.util.Scanner;
 public class Acceleration2 {
 public static void main(String[] args){

	Scanner input = new Scanner(System.in);
	System.out.print("Enter starting v0:");
	double velocity0 = input.nextDouble();

	System.out.print("Enter finishing v1:");
	double velocity1 = input.nextDouble();

	System.out.print("Enter time:");
	double time = input.nextDouble();

	double acceleration = (velocity1 - velocity0)/time;
	System.out.print("Average acceleration is: " + acceleration);
}
}

