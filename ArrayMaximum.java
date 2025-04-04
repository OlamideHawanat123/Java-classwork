import java.util.Arrays;
public class ArrayMaximum{

public static int [] twoMaximum(int [] number){
	int maximum = number[0];
	int secondMaximum = 0;
	int[] newArray = new int [2]; 

	for(int count = 0; count < number.length; count++){
	if(number[count] > maximum){
	secondMaximum = maximum;
	maximum = number[count];
	}

	else if(number[count] > secondMaximum && number[count] != maximum){
	secondMaximum = number[count];
	}

	newArray[0] = maximum;
	newArray[1] = secondMaximum;
	}
	return newArray;
	}

public static void main(String...args){
	int [] number = {1, 4, 6, 8, 0, 1, 2, 7};
	int maximum[] = twoMaximum(number);
	System.out.print(Arrays.toString(maximum));
	}








}