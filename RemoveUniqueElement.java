public class RemoveUniqueElement {
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
        int[] number = {1, 2, 3, 2};
        NonUniqueElements(number);
    	}

	}
