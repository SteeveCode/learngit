
public class CompoundInterestWithSwitchStatement {

	public static void main(String[] args) {
		int period = 47;
		float amount = 1000;
		float rate = 0.05F;
		
		switch(period) {
		case 5:
			amount += amount * rate;
		case 4:
			amount += amount * rate;
		case 3:
			amount += amount * rate;
		case 2:
			amount += amount * rate;
		case 1:
			amount += amount * rate;
			System.out.println("The compound interest after "+period+" years is "+amount);
			break;
		default:
			System.out.println("Invalid Period entered !!!");
		
		}
		

	}

}
