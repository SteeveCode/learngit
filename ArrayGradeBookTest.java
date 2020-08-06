/* Java textbook example - chapter 7
Fig. 7.19: GradeBookTest.java
GradeBookTest creates GradeBook object using a two-dimensional array
of grades, then invokes method processGrades to analyse them.
 */
public class ArrayGradeBookTest {

	public static void main(String[] args) {
	
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
		
		ArrayGradeBook myGradeBook = new ArrayGradeBook("CS101 Introduction to Java Programming", gradesArray);
		myGradeBook.displayMessage();
		myGradeBook.processGrades();
		System.out.println();
		myGradeBook.popArray(gradesArray2);

	}// end main

}// end class GradeBookTest
