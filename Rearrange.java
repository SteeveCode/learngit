// code to get all possible arrangement of letters not perfect yet

import java.util.*;
public class Rearrange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] coro = {"k","e","r","b","a","u","t","o"};
		String[] update = new String[8];
		Random ran = new Random();
		for(int j=0; j<64; j++) {
			for(int i=0;i<8;i++) {
				int lim = ran.nextInt(8);
				update[i] = coro[lim];
				System.out.print(update[i]);
		}
			System.out.println();
		}
		
		 
			
		 

	}

}
