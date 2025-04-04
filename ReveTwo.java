public class ReveTwo{
public static int uniqueOne(int[] number){
int uniqueElement = number[0];

for(int count = 0; count < number.length; count++){
for(int counter = 0; counter < number[count]; counter++){
if(number[counter] != number[count]){
uniqueElement = number[count];
}
}
}
return uniqueElement;
}

public static void main(String...args){
int[] number = {2, 1, 2};
int numbers = uniqueOne(number);
System.out.print(numbers);
}











}