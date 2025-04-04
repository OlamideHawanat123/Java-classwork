public class HighestNumber{

	public static int[] highest(int[][] number){
	int maximum = number[0][0];

	int maxRow = 0;
	int maxColumn = 0;
	int[] maxValueRowAndColumn = new int [2];
	for(int count = 0; count < number.length; count++){

	for(int counter = 0; counter < number[0].length; counter++){
	if(number[count][counter] > maximum){
	maximum = number[count][counter];
	maxRow = count;
	maxColumn = counter;
	
	maxValueRowAndColumn = {maxRow, maxColumn}; 	
	}
	}
	}
return maxValueRowAndColumn;
	}

public static void main(String...args){

int[][] numbers = {{1, 2, 3}, {4, 5, 6}};
int maxValueRowAndColumn = highest(numbers);

System.out.print(maxValueRowAndColumn);
} 








}