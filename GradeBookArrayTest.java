
public class GradeBookArrayTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] gradesArray= {87,68,94,100,83,78,85,91,76,87};
		
		int[][] gradesArray2 = { { 87, 96, 70 },
				{ 68, 87, 90 },
				{ 94, 100, 90 },
				{ 100, 81, 82 },
				{ 83, 65, 85 },
				{ 78, 87, 65 },
				{ 85, 75, 83 },
				{ 91, 94, 100 },
				{ 76, 72, 84 },
				{ 87, 93, 73 } };
		
		GradeBookArray myGradeBook = new GradeBookArray("CS101 Introduction to Java Programming", gradesArray);
		myGradeBook.displayMessage();
		myGradeBook.processGrades();
		System.out.println();
		myGradeBook.popArray(gradesArray2);

	}// end main

}// end class GradeBookTest
