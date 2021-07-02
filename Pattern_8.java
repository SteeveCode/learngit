

public class Pattern_8 {

public static void main(String[] args) {
		
int rowSizes = 9;
int rowSpaces = --rowSizes;

for(int i =1; i<= rowSizes; i++){

	for(int j = 0; j<rowSpaces; j++){
		System.out.print(" ");
	}
	for(int k = i; k > 0; k--){
		System.out.print(k);
	}
	
	for(int l=2; l<=i; l++){
	
		System.out.print(l);
	} 
	System.out.println();
	rowSpaces--;
}

	}

}
