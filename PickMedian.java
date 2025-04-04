public class PickMedian{
public static double median(int[] numberOne, int[] numberTwo){
int[] mergedArray = new int[numberOne.length + numberTwo.length];
int median = 0;
for(int count = 0; count < numberOne.length; count++){
mergedArray[count] = numberOne[count];
}
for(int count = 0; count < numberTwo.length; count++){
mergedArray[numberOne.length + count] = numberTwo[count]; 
}

int midArray = mergedArray.length / 2;
median = mergedArray[midArray];

return median;
}

public static void main(String...args){
int[] numberOne = {1, 2};
int[] numberTwo = {3,4};
double result = median(numberOne, numberTwo);
System.out.print(result);
}
}