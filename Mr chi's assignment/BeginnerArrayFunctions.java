public class BeginnerArrayFunctions{
	public static void main(String...args){

	BeginnerArray input = new BeginnerArray();

	int[] numbers = {4, 3, 67, 5, 6, 2, 2, 9};

	int maximum = input.findMax(numbers);
	System.out.println("The maximum number is: " + maximum);

	int minimum = input.findMin(numbers);
	System.out.println("The minimum number is: " + minimum);

	int sumOfIntegers= input.findSum(numbers);
	System.out.println("The sum of all integers is: " + sumOfIntegers);

	int sumOfEvenIntegers = input.findSumOfEvenNumber(numbers);
	System.out.println("The sum of even numbers is:" + sumOfEvenIntegers);

	int sumOfOddIntegers = input.findSumOfOddNumber(numbers);
	System.out.println("The sum of odd numbers in the array is: " + sumOfOddIntegers);

	int numberOfOdd = input.noOfOddNumbers(numbers);
	System.out.println("The number of odd numbers is: " + numberOfOdd);

	int numberOfEven = input.noOfEvenNumbers(numbers);
	System.out.println("The number of even numbers is: " + numberOfEven);

	


}
}