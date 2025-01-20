public class PrimeNumber{
public static void main(String...args){

int number = 23;
System.out.print("number is : " + primeNumber(number));
}
public static boolean primeNumber(int number){
int counter = 0;
	for(int count = 1; count <= number; count++){
	if(number % count == 0){
	counter ++;
	}
	}

	if(counter == 2){
	return true;
	}
	return false;
	}
}

