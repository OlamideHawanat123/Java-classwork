public class MultidimensionalHighest{

public static int returnIndexOfHighest(int[][] number){
int highest = number[0][0];
for(int count = 0; count < number.length; count++){
for(int counter = 0; counter < number[0].length; counter++){
if(number[count][counter] > highest){
highest = number[count][counter];
}
}
}
return highest;
}


public static void main(String...args){
int[][] number = {
	{1, 2, 3},
	{4, 10, 6},
	{7, 8, 8}
	};
int result = returnIndexOfHighest(number);
System.out.print(result);
}














}