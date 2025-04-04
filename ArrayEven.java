import java.util.Arrays;
public class ArrayEven{
public static int[] even(int[] number){
int counter = 0;

for(int count = 0; count < number.length; count++){
if(number[count] % 2 == 0){
counter++;
}
}
int[] evenNumbers = new int[counter];

for(int count = 0; count < number.length; count++){
if(number[count] % 2 == 0){
evenNumbers[counter] = number[count];
}
}
return evenNumbers;

}
}

