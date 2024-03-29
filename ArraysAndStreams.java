import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Collectors;
import java.util.List;

public class ArraysAndStreams
 {
 public static void main(String[] args)
 {
 Integer[] values = {2, 9, 5, 0, 3, 7, 1, 4, 8, 6};

 // display original values
 System.out.printf("Original values: %s%n", Arrays.asList(values));

// sort values in ascending order with streams
 System.out.printf("Sorted values: %s%n",
	Arrays.stream(values)
	.sorted()
	.collect(Collectors.toList()));

// values greater than 4
List<Integer> greaterThan4 =
	Arrays.stream(values)
	.filter(value -> value > 4)
	.collect(Collectors.toList());
System.out.printf("Values greater than 4: %s%n", greaterThan4);
 
 }
}