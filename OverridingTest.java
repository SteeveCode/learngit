
public class OverridingTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cycle cycle = new Cycle();
		cycle.printInfo();
		
		Bicycle bicycle = new Bicycle();
		bicycle.printInfo();
	}

}

class Cycle{
	int weight = 10;
	
	public void printInfo() {
	System.out.println("Superclass "+weight);	
	}
	
}

class Bicycle extends Cycle{
	public String brand = "Hero";
	
	@Override
	public void printInfo() {
		System.out.println("Subclass "+brand);	
	
		}
}