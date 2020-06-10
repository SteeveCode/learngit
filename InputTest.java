import java.io.InputStream;
import java.io.InputStreamReader;

public class InputTest {
public static void main(String args[]) {

BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter your name");
String data=br.readLine();
System.out.println("Your name is "+data);

}
}