import java.util.Scanner;
public class StudentGrade{
	public static void main(String...args){

	Scanner input = new Scanner(System.in);

	System.out.print("Enter your grade:");
	int grade = input.nextInt();

System.out.println(grade >= 50 ? "passed" : "Failed");		



	
	}





}