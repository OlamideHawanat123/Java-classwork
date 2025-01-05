public class Logistics{
	
int[] amountPerParcel = {160, 200, 250, 500};
int basePay = 5000;

public int noOfDelivery(int numberOne){
int riderPay = 0;

if(numberOne >= 70){
basePay = (numberOne * amountPerParcel[3] + basePay);
}

else if(numberOne >= 60){
basePay = (numberOne * amountPerParcel[2] + basePay);
}

else if(numberOne >= 50){
basePay = (numberOne * amountPerParcel[1] + basePay);
}

else{
basePay = (numberOne * amountPerParcel[0] + basePay);
}

return basePay;
}


}

