public class ThirdQuestion{

public int uniqueElement(int[] number){
int uniqueOne = 0;
for(int count = 0; count < number.length; count++){
	if(number[count] != number[count]){
		uniqueOne += number[count];
	}
	}
return uniqueOne;
}
	








}