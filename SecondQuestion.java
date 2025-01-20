public class SecondQuestion{

public static int lengthOfLastWorld(String words){
int lengthOfWord = 0;
  for(int count = 0; count < (words.length); count++){
	for(int counter = 0; counter <= count; count--){
	lengthOfWord += words.charAt(counter);
}
}
return lengthOfWord;
}
public static void main(String...args){	
String word = "Ola is a girl";

int length = lengthOfWord(word);
System.out.print(length);
}

}