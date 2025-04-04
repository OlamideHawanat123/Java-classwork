public class RemoveDuplicateElement{

public static int[] removeDuplicate(int[] number, int duplicate){
for(int count = 0; count < number.length; count++){
if(number[count] != duplicate){
number = number[count];
}
}
return number;
}



}