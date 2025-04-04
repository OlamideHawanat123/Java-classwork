public class ConsecutiveNumbers{
  
 public static boolean FourSimilarDigitsInARow(int[] number) {
        if (number.length < 4) {
            return false;
        }

        for (int count = 0; count < number.length; count++) {
            if (number[count] == number[count + count] && number[count] == number[count + count] && number[count] == number[count + count]) {
                return true;
            }
        }

        return false;
    }

 public static void main(String[] args) {
        int[] number = {1, 4, 4,4,2,};
        System.out.println(FourSimilarDigitsInARow(number));
    }

}
