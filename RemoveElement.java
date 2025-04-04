public class RemoveElement{

public static int[] remove(int[] number, int numberToBeRemoved){
int[] newArray = new int [newArray.length -numberToBeRemoved];
for(int count = 0; count < number.length; count++){
if(number[count] == numberToBeRemoved){
newArray = number[count] -numberToBeRemoved;  
}
}
return newArray;
}












}