public class Maina{

public int summation(int numberOne, int numberTwo){
return numberOne + numberTwo;
}

public int summation(int numberOne, int numberTwo, int x){
return numberOne + numberTwo + x;
}

public double summation(double numberOne, double numberTwo){
return numberOne + numberTwo;
}

public void name(){
System.out.println("Yoo");
}

public static void main(String[] args){
Maina myObj = new Maina();
int numbers = myObj.summation(5, 2);
System.out.println("The sum is: " + numbers);

int number = myObj.summation(5, 6);
System.out.println(number);

double numb = myObj.summation(5,6);
System.out.println(numb);

string tee = myObj.name();
System.out.println(tee);



}

}