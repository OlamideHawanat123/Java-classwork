import java.util.Arrays;
public class RemoveDuplicateElement{

public static int[] removeDuplicate(int[] number, int duplicate){
int[] newArray = new int[1];
int[] nimb = new int [1]		;
for(int count = 0; count < number.length; count++){
if(number[count] != duplicate){
nimb = number[count];
}
}
return nimb;
}

public static void main(String...args){

int[] number = {1, 2, 3, 4, 2, 2};
int duplicate = 2;
int[] result = removeDuplicate(number, duplicate);

System.out.print(Arrays.toString(result));
}

}