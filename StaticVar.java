// this program demonstrates how static variable work.
public class StaticVar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test test1 = new Test();
		System.out.printf("Count of objects created so far %s: \n",Test.getCount());
		System.out.printf("Number of objects created so far %s: \n",test1.getNum());
		Test test2 = new Test();
		Test test3 = new Test();
		System.out.printf("Count of objects created so far %s: \n",Test.getCount());
		System.out.printf("Number of objects created so far %s: \n",test1.getNum());
		Test test4 = new Test();
		Test test5 = new Test();
		Test test6 = new Test();
		System.out.printf("Count of objects created so far %s: \n",Test.getCount());
		System.out.printf("Number of objects created so far %s: \n",test2.getNum());
		Test test7 = new Test();
		Test test8 = new Test();
		System.out.printf("Total number of objects created is %s: \n",Test.getCount()); // Returns a record of the total number of objects that are created from the class Test.
		System.out.println(test5.getNum()); //  Returns a record of each instance of an objects that is created from the class Test.
		System.out.println(test2.getCount()); // Any reference to a class object can call a static method that is part of its class.

	}

}


class Test{
static int count=0;
int num = 0;
public Test(){
count++;// Keeps a record of the total number of objects that are created from the class Test.
num++; // Keeps a record of each instance of an objects that is created from the class Test.
//System.out.println(count);
}

public static int getCount() {
	
	return count;
}

public int getNum() {
	
	return num;
}
}
