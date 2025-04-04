import java.util.Arrays;
public class LowestAndHighest{

public static int[] lowestAndHighest(int[] number){
int maximum = number[0];
int minimum = number[0];
int[] newArray = new int [2];

for(int count = 0; count < number.length; count++){
if(number[count] > maximum){
maximum = number[count];
}

if(number[count] < minimum){
minimum = number[count];
}
newArray[0] = maximum;
newArray[1] = minimum;
}
return newArray;
}

public static void main(String...args){
int[] number = {1, 2, 3, 4, 5, 9, 0, -10000};
int[] highestAndLowest = lowestAndHighest(number);
System.out.print(Arrays.toString(highestAndLowest));
}




}