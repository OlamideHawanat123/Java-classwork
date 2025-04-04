import java.util.Arrays; 
public class RemoveDuplicate{

public static int[] duplicate(int [] number){
	int duplicate = number[0];
	int[] newArray = new int[1];
	for(int count = 0; count < number.length; duplicate++){
	for(int counter = 0; counter < number.length; counter++){
	if(number[count] != number[counter]){
	newArray[0] = number[count];
	}

	}
	}

	return newArray;
	}

public static void main(String...args){
int[] number = {1, 2, 3, 4, 3};
int[] result = duplicate(number);
System.out.print(Arrays.toString(result));
}





























/*public class RemoveUniqueElement {
    public static void NonUniqueElements(int[] number) {
	int unique = 0;
        for (int count = 0; count < number.length; count++) {

 	for (int counter = 0; counter < number.length; counter++) {
	if (number[count] == number[counter]) {
	unique++;
	}
	}
            
       if (unique == 1) {
       System.out.print(number[count] + " ");
       }
       }
       }

public static void main(String[] args) {
        int[] number = {1, 2, 3, 4, 3};
        NonUniqueElements(number);
    	}

	}

	













*/}