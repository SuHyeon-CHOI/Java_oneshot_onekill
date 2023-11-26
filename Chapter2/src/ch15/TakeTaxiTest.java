package ch15;

public class TakeTaxiTest {

	public static void main(String[] args) {
		
		Passenger passenger = new Passenger("Edward", 20000);
		
		Taxi taxi1 = new Taxi("잘 간다 운수 택시");
		
		passenger.takeTaxi(taxi1);
		
		passenger.showInfo();
		taxi1.showTaxiInfo();
		
			
	}

}
