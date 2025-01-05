public class Logistics{

	public int noOfDelivery(int numberOne){
	int riderPay = 0;

	if(numberOne >= 70){
	riderPay = 5000 + (numberOne * 500);
	}

	else if(numberOne >= 60){
	riderPay = 5000 + (numberOne * 250);
	}

	else if(numberOne >= 50){
	riderPay = 5000 + (numberOne * 200);
	}

	else{
	riderPay = 5000 + (numberOne * 160);
	} 

	return riderPay;
	}


}