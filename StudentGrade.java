import java.util.Scanner;
import java.util.ArrayList;
public class StudentGrade{

	public static void main(String...args){
	StudentGrade input = new StudentGrade();

	ArrayList<Integer> studentsNumber = new ArrayList<>();
	ArrayList<Integer> subjectOffered = new ArrayList<>();

	Scanner scanner = new Scanner(System.in);

	System.out.println("How many students do you have?:");
	int students = scanner.nextInt();
	studentsNumber.add(students);

	System.out.println("How may subjects do they offer?:");
	int subjects = scanner.nextInt();
	subjectOffered.add(subjects);

	input.savingStatus();
	input.savingStatus2();
	
	
	
	
	































}











}