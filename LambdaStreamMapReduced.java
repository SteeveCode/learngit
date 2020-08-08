import static org.junit.Assume.assumeFalse;

import java.util.stream.IntStream;

public class LambdaStreamMapReduced {

	public static void main(String[] args) {
		// sum the even integers from 2 through 20
		System.out.printf("Sum of of even ints from 2 through 20 is: %d%n", IntStream.rangeClosed(1,10)
				.map((int x)-> {return x * 2;}).sum());
	}

}
