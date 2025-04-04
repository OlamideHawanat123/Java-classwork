public class Palindrome3{

public static boolean returnPalindrome(int number){
int lastDigit = number % 10;
int twoNumber = number / 10;

int secondDigit = twoNumber % 10;
int firstDigit = twoNumber / 10;
return lastDigit == firstDigit;
}

public static void main(String...args){
int number = 121121;
boolean result = returnPalindrome(number);
System.out.print(result);
}
















}