import java.util.*;
import java.util.stream.*;

public class Streamapi{
    public static void main(String []args){
        ArrayList<Integer> marks = new ArrayList<>();
	marks.add(0);
	marks.add(10);
	marks.add(20);
	System.out.println(marks);

	List<Integer> updatedMarks = marks.stream().map(i->i+5).collect		(Collectors.toList());
	System.out.println(updatedMarks);
        }
}

