public class LargestElement{

public int smallestIndex(int[] numbers){
int maximum = numbers[0];
int minimum = 0;
for(int count = 0; count < numbers.length; count++){
if(numbers[count] > maximum){
maximum = numbers[count];
minimum = count;
}
}
return minimum;
}
}





