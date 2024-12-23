public class ArrayNumber{
	public static void main(String...args){

	int [] numbers = {12, 4, 5};

	int sum = 0;
	for(int number = 0; number < numbers.length; number++){
	sum += numbers[number];
	}
	

	int numbersLength = numbers.length;
	double average = sum / numbersLength;

	System.out.println("the sum is:" + sum);
	System.out.println("the average is:" + average);
	
	}


} 