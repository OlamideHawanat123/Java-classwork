public class GreatestCommonDivisor{

public static int commonDivisor(int numberOne, int numberTwo){
int divisor = 0;
        for (int count = 1; count <= numberOne && count <= numberTwo; count++) {
        if (numberOne % count == 0 && numberTwo % count == 0) {
        divisor = count;
        }
        } 
	return divisor;
	 }       

	
public static void main(String...args){

	int numberOne = 1;
	int numberTwo = 0;

	int result = commonDivisor(numberOne, numberTwo);
	System.out.print(result);
	}
	

	
	








}