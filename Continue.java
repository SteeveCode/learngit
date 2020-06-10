
public class Continue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

int j =0;
for(int i =1; i<=100; i++){
	
	if(i%5 != 0) {
		System.out.println("Skip to the next iteration " +i);
		continue;
	}
	
	System.out.print(i);
	System.out.println("   //value of 'i' was printed. Iteration was not skipped.");

	}

}
}