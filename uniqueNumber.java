import java.util.Arrays;

public class UniqueNumbers{

public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 3, 8, 9, 10, 8, 9};
        int[] UniqueNumber = uniqueNumbers(array);

        for (int num: UniqueNumber) {
            System.out.print(num + " ");
        }
    }
    


  public static int[] uniqueNumbers(int[] array) {
        int nums = array.length;
        int[] temp = new int[nums];
        int tempIndex = 0;

        for (int item = 0; item < nums; item++) {
            boolean unique = true;
            for (int count = 0; count < nums; count++) {
                if (item != count && array[item] == array[count]) {
                    unique = false;
                    break;
                }
            }
            if (unique) {
                temp[tempIndex++] = array[item];
            }
        }

        int[] result = new int[tempIndex];
        System.arraycopy(temp, 0, result, 0, tempIndex);
        return result; 
}


     }