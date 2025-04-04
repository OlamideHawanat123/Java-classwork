import java.util.Arrays;
public class TwoSumThatEqualsTarget{

public static int[] sumUpToTarget(int[] number, int target){
	int[] theIndices = new int [2];
	
	for(int count = 0; count < number.length; count++){
	for(int counter = 0; counter < number.length; counter++){
	
	if(number[count] + number[counter] == target){
	theIndices[0] = count;
	theIndices[1] = counter;
	}
	}
	}
	return theIndices;
	}


public static void main(String...args){
	int[] number = {5,5};
	int target = 10;

	int[] result = sumUpToTarget(number, target);
	System.out.print(Arrays.toString(result));



}

}