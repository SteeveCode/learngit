import java.util.stream.IntStream;

public class LambdaStreamFilterMapReduce {

	public static void main(String[] args) {
		// sum the tripples of the even integers from 2 to 10
		
		System.out.printf(
				"sum the tripples of the even integers from 2 to 10 is:%d%n ", IntStream.rangeClosed(1,10)
				.filter(x -> x % 2 == 0)
				.map(x -> x * 3)
				.sum()
				);

	}

}
