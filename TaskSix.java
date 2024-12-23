public class TaskSix{
	public static void main(String...args){
	for(int number = 1; number <= 10; number+=1 ){

	if(number % 4 == 0)System.out.println(number);

	int multiple = number;
	for(number = 0; number <=5; number+=1){
	System.out.print(multiple * number);
	}
	}
}
}