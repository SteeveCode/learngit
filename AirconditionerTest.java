//This code was submitted by Patience for debugging
public class AirconditionerTest {

	public static void main(String...args){
		Airconditioner obj1 = new Airconditioner("Tech","Blue");
		Airconditioner obj2 = new Airconditioner(20);
		Airconditioner obj3 = new Airconditioner(15.6);
		Airconditioner obj4 = new Airconditioner(180.7);
		System.out.println(obj1.getName());
		System.out.println(obj1.getColor()); 
		System.out.println(obj2.getTemperature());
		System.out.println(obj2.TempIncrease());
	}

}
