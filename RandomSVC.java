import java.util.*;
public class RandomSVC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random random = new Random();
		int randomNum = 0;
		
		for(int i=1; i<=40; i++) {
			randomNum = 4001 + random.nextInt(40);
		System.out.println(randomNum);
		}

	}

}
