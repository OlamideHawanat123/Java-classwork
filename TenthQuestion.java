public class TenthQuestion{

public static int convertToMachineLanguage(int[] number){

for(int count = 0; count < number.length; count++){
if(count % 2 == 0){
number[count] = 0;
}
else if(count  % 2 == 1){
number[count] = 1;
}
}
return number[count];
}

public static void number(String...args){
int[] number = {1, 2, 3, 4, 5};
int machine = convertToMachineLanguage(number);
System.out.print(machine);
}





}