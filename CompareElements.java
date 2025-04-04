public class CompareElements{

public static int scores(int[] numberOne, int[] numberTwo){
int scoreNumberOne = 0;
int scoreNumberTwo = 0;

for(int count = 0; count < numberOne.length; count++){
for(int counter = 0; counter < numberTwo.length; counter++){

if(numberOne[count] > numberTwo[counter]){
scoreNumberOne +=1;
}else 
if(numberOne[count] < numberTwo[counter]){
scoreNumberTwo += 1;
}
else{
scoreNumberOne = 0;
scoreNumberTwo = 0;
}
}
}

int nums = 0;
int[] number = {scoreNumberOne, scoreNumberTwo};
for(int count = 0; count < number.length; count++){
nums = number[count];
}
return nums;
}

public static void main(String...args){
int[] bola = {17, 28, 30};
int[] bala = {99, 16, 10};

int result = scores(bola, bala);
System.out.print(result);

}









}