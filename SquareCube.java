import java.util.Scanner;

public class SquareCube{
public static void main(String[]args){
	System.out.println("Enter size of cube");
	Scanner input = new Scanner(System.in);
	int sizeOfCube = input.nextInt();

	for(int i=1; i<= sizeOfCube; i++){
		if(i==1 || i==sizeOfCube) { // this condition determines how the row should be printed
			for(int j=1; j<= sizeOfCube; j++) 
				System.out.print("*");
		}
			
		else {
			for(int k=1; k<= sizeOfCube; k++) {
				if(k==1 || k==sizeOfCube) 
					System.out.print("*");
				else
					System.out.print(" ");
		}
			
		}
		System.out.println();

}

}
}

