// practising how to use toString method to return the string representation of an object.
public class Method2String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MethodTS methodts = new MethodTS("Bola",25);
		System.out.print(methodts.toString());

	}

}

class MethodTS{
	
	String name;
	int age;
	
	public MethodTS(String name, int age) {
		this.name =name;
		this.age = age;
	}
	public String toString() {
		
		return String.format("Name is %s and Age is %d",name,age);
	}
}


