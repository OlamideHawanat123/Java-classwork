import java.util.Arrays;

public class  MedianOfArrays{

 public static int getMedian(int[] array) {
	 if (array.length % 2 == 0) {
		 
		int median = array.length / 2;
            return (array[median] + array[median - 1]) / 2;
        }
	  return array[array.length / 2];
 }



public static void main(String[] args) {
	 int[] num1 = {1,2,3};
	 
	 System.out.println("Original array: " + Arrays.toString(num1));
	 
	 System.out.println("Median of the first array of integers: " + getMedian(num1));
	 
	  int[] num2 = {2,3,4};
	  System.out.println("\nOriginal array: " + Arrays.toString(num2));
	  
System.out.println("Median of the second  array of integerss: " + getMedian(num2));

double median = getMedian(num1) + getMedian(num2) / 2;
System.out.print("The overall median is: " + median);
 
	}
}
