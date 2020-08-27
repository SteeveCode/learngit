package Chapter10MakingADifference;

public class Building implements CarbonFootprint{
	private double electricity;
	private double gas;
	private double co2;
	
	
	public Building(double electricity, double gas, double co2) {
		super();
		this.electricity = electricity;
		this.gas = gas;
		this.co2 = co2;
	}

	public void buildingType() {
		System.out.println("The building is a bungalow");
	}

	public double getElectricity() {
		return electricity;
	}

	public double getGas() {
		return gas;
	}

	public double getCo2() {
		return co2;
	}

	public double getCarbonFootprint() {
		return co2 * 105.0; //note: formula is not correct. this is just for testing
		}
	
	@Override
	public String toString() {
		
		return String.format("%s%.2f","The carbon footprint for buliding is: ",getCarbonFootprint()) ;
	}
	
}
