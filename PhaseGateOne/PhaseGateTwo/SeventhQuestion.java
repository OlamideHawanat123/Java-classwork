public class SeventhQuestion{

public static int reverse(int number){
int reversed_number = 0;

for(int count = 0; count <= number; count++){
 for(int counter = 0; counter <= count; counter--){
	reversed_number = counter;
}
}
return reversed_number;
}

public static void main(String...args){

System.out.print(reverse(123));

}

}