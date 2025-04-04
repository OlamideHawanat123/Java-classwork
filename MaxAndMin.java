import java.util.Arrays;
public class MaxAndMin{
	public static int[] highestAndMinimum(int[] number){
	int[] newArray = new int [2];
	int maximum = number[0];
	int minimum = number[0];
	
	for(int count = 0; count < number.length; count++){
	if (number[count] > maximum){
	maximum = number[count];
	}
	if (number[count] < minimum){
	minimum = number[count];
	}
	}
	newArray[0] = maximum;
	newArray[1] = minimum;
	
	return newArray;
	}

public static void main(String...args){
int[] number = {2, 3, 8, 7, 9};
int[] maxAndMin = highestAndMinimum(number);
System.out.print(Arrays.toString(maxAndMin));
}

}