public class TaskFour{
public int[] evenIndex(int[] number){
int[] newArray = new int[number.length/2];
int index = 0;
for(int count = 0; count < number.length; count+=2){
newArray[index++] = number[count];
}
return newArray;
}

public int[] oddIndex(int[] number){
int[] newArray = new int[number.length/ 2];
int index = 0;
for(int count = 1; count < number.length; count+=2){
newArray[index++] = number[count];
}
return newArray;
}

public int sumOfEvenIndex(int[] number){
int sum = 0;
for(int count = 0; count < number.length; count+=2){
sum+= number[count];
}
return sum;
}

public int sumOfOddIndex(int[] number){
int sum = 0;
for(int count = 1; count < number.length; count+=2){
sum += number[count];
}
return sum;
}

}

//javac -cp "junit-platform-console-standalone-1.10.2.jar" GreatestCommonDivisorTest.java GreatestCommonDivisor.java

//java -jar junit-platform-console-standalone-1.10.2.jar --class-path . --scan-classpath --include-classname GreatestCommonDivisorTest
