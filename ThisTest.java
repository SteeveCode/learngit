
public class ThisTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thiss thiss1 = new Thiss(5);
		System.out.println("Memory address of thiss1 object: "+ thiss1);
		System.out.println();
		Thiss thiss2 = new Thiss(10);
		System.out.println("Memory address of thiss2 object: "+ thiss2);
		System.out.println();
		Thiss thiss3 = new Thiss(7, "");
		System.out.println("Memory address of thiss3 object: "+ thiss3);
		System.out.println();

	}

}


class Thiss{	
int num;
public Thiss(int num){
		this.num=num; // Initialisation pattern 1
		System.out.println(num);
		System.out.println("Memory address of this keyword: "+this);
	}


// This constructor has a different initialisation pattern from the constructor above. This is not a good practice, hence the reason for using 
// the "this" keyword to standardise how a constructor is be initialise and other constructors can reference the standard method using "this" keyword.
public Thiss(int num1, String s) {
	this.num = 50+ num1; // Initialisation pattern 2
	System.out.println(num);
	System.out.println("Memory address of this keyword: "+this);
	
}
}

