public class BeginnerArray{

	public int findMax(int [] array){
 	int max = array[0];

	for(int count = 0; count < array.length; ++count){
	if(array[count] > max){
	max = array[count];
	}
	}
	
	return max;
	}

	public int findMin(int [] array){
	int min = array[0];

	for(int count = 0; count < array.length; ++count){
	if(array[count] < min){
	min = array[count];
	}
	}

	return min;
	}

	public int findSum(int[] array){
	int sum = 0;

	for(int count = 1; count < array.length; ++count){
	sum += array[count];
	}

	return sum;
	}

	public int findSumOfEvenNumber(int[] array){
	int sumOfEven = 0;

	for(int count = 0; count < array.length; ++count){
	if(array[count] % 2 == 0){
	sumOfEven += array[count];
	}
	}

	return sumOfEven;
	}

	public int findSumOfOddNumber(int[] array){
	int sumOfOdd = 0;

	for(int count = 0; count < array.length; ++count){
	if(array[count] % 2 != 0){
	sumOfOdd += array[count];
	}
	}

	return sumOfOdd;
	}

	public int noOfOddNumbers(int[] array){
	int odd = 0;
	
	for (int count = 0; count < array.length; ++count){
	if(array[count] % 2 == 1){
	odd += 1;
	}
	}
	return odd;
	}

	public int noOfEvenNumbers(int [] array){
	int even = 0;

	for(int count = 0; count < array.length; ++count){
	if(array[count] % 2 == 0){
	even += 1;
	}
	}

	return even;
	}

		

	 



}