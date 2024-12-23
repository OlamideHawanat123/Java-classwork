public class Kata{

	public boolean isEven(int number) {
	return number % 2 == 0;
	}

	public int subtraction(int numberOne, int numberTwo){
	return (Math.abs(numberOne - numberTwo));
	}

	public boolean palindrome(int numberOne){
	int lastDigit = numberOne % 10;
	int fourNumbers = numberOne / 10;

	int fourthDigit = fourNumbers % 10;
	int thirdNumbers =  fourNumbers / 10;

	int thirdDigit = thirdNumbers % 10;
	int twoNumbers = thirdNumbers / 10;

	int secondDigit = twoNumbers % 10;
	int firstDigit = twoNumbers / 10;

	return lastDigit == firstDigit && secondDigit == fourthDigit;
	} 

	public boolean isSquare(int numberOne){
	double squareRoot = (Math.sqrt(numberOne));

	return squareRoot * squareRoot == numberOne;
	}

	public float division(int numberOne, int numberTwo){
	if(numberTwo == 0){
	return 0;
	}	

	else {
	return numberOne / numberTwo;
	}
	}
	


}