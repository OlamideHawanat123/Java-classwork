import java.util.Arrays;
public class RotateImage{

public static int[][] rotateAnImage(int[][] number){
	int numberRow = number.length;
	int numberColumn = number[0].length;
	int[][] newAray = new int[numberRow][numberColumn];
	 
	for(int count = 0; count < number.length; count++){
	for(int counter = 0; counter < number[0]; counter++){
	newArray = [counter][count];
	}
	}
	return newArray;
	}


public static void main(String...args){
int [][] number = {
	{1, 2, 3},
	{4, 5, 6},
	{7, 8, 9}
	};

	int result = rotateAnImage(number);

	System.out.print(Arrays.toString(result));
	}





 











}