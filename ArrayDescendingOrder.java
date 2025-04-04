import java.util.Arrays;
public class ArrayDescendingOrder{

public static int[] returnInDescending(int[] numberOne, int[] numberTwo){
	int[] concatenatedArray = new int[numberOne.length + numberTwo.length];
	for(int count = 0; count < numberOne.length && count < numberTwo.length; count++){
	concatenatedArray = (numberOne[count] + numberTwo[count]);
	}
	return concatenatedArray;
	}



public static void main(String...args){
int[] numberOne = {3, 2, 1};
int[] numberTwo = {5, 8, 6};

int[] concatenatedResult = returnInDescending(numberOne, numberTwo);
System.out.print(concatenatedResult);
}

















}