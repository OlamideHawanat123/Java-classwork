import java.util.Scanner;
public class AccountBalance{
public static void main(String...args){

Scanner scanner = new Scanner(System.in);

System.out.println("Enter account number:");
int AccountNumber = scanner.nextInt();

System.out.println("Enter balance at the beginning of the month:");
int balance = scanner.nextInt();

System.out.println("Enter total charges:");
int totalCharges = scanner.nextInt();

System.out.println("Enter credit:");
int totalCredit = scanner.nextInt();

System.out.println("Enter allowed credit limit:");
int creditLimit = scanner.nextInt();

int newBalance = balance + totalCharges - totalCredit;
System.out.println("Your new balance is: " +  newBalance);

if (newBalance > creditLimit);
System.out.print("Credit limit exceeded");
}

}
