public class Reve{
public static int length(String word){
int number = 0;
for(int count = word.length() -1; count >= 14 ; count--){
number++;
}

return number;
}

public static void main(String...args){
String word = "fly me to the moon";
int numberOf = length(word);
System.out.print(numberOf);
}



}