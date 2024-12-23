 import java.util.Scanner;
public class LargestAndSmallestNumbers{
	public static void main(String...args){

Scanner input = new Scanner(System.in);

System.out.print("Enter first number:");
int integer1 = input.nextInt();

System.out.print("Enter second number:");
int integer2 = input.nextInt();


System.out.print("Enter third number:");
int integer3 = input.nextInt();


System.out.print("Enter fourth number:");
int integer4  = input.nextInt();


System.out.print("Enter fifth number:");
int integer5 = input.nextInt();

int smallest = 0;

if(integer2 < smallest){
integer2 = smallest;
}

if(integer3 < smallest){
integer3 = smallest;
}

if(integer4 < smallest){
integer4 = smallest;
}

if(integer5 < smallest){
integer5 = smallest;
}

System.out.println("The smallest number is:" + smallest);

int largest = 0;

 if(integer2 > largest){
integer2 = largest;
}

if(integer3 > largest){
integer3 = largest;
}

 if(integer4 > largest){
integer4 = largest;
}

 if(integer5 > largest){
integer5 = largest;
}

System.out.println("The largest number is:" + largest);






}


}

