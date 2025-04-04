import java.util.Arrays;
public class IndexOfSmallestNumber{

public static int[] indexOf(int[] number){
	int smallest = number[0];
	int[] indexOfSmallest = new int[1];
	for(int count = 0; count < number.length; count++){
	if(number[count] < smallest){
	smallest = number[count];
	indexOfSmallest[0] = count;
	}
	}

	return indexOfSmallest;
	}


	public static void main(String...args){
	int[] number = {0, 5, -1, 2, -1, -6, -100000, 9000};
	int[] output = indexOf(number);

	System.out.print(Arrays.toString(output));
	}
	
	
















}