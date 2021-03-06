package Chapter10MakingADifference;

public class Car implements CarbonFootprint {
	
	private double mileage; // SI unit is Miles
	private double efficiency;
	private double co2;
	
	public void move() {
		System.out.println("The car is moving");
	}

	public Car(double mileage, double efficiency, double co2) {
		super();
		this.mileage = mileage;
		this.efficiency = efficiency;
		this.co2 = co2;
	}

	public double getMileage() {
		return mileage;
	}

	public double getEfficiency() {
		return efficiency;
	}

	public double getCo2() {
		return co2;
	}
	
	public double getCarbonFootprint() {
		return co2 * 105.0;} //note: formula is not correct. this is just for testing

	@Override
	public String toString() {
		
		return String.format("%s%.2f","The carbon footprint for Car is: ",getCarbonFootprint()) ;
	}
}
