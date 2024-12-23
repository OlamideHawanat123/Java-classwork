public class ArrayNumber{
	public static void main(String...args){

	int [] numbers = new int[3];
	int numbers = {12, 4, 5};

	int sum = 0;
	for(int number : numbers){
	sum += number;
	}

	int numbersLength = numbers.length;
	double average = sum / numbersLength;

	System.out.println("the sum is:" + sum);
	System.out.println("the average is:" + average);
	
	}


}