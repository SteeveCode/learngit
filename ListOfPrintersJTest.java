import static org.junit.jupiter.api.Assertions.*;

import java.io.BufferedWriter;

import javax.print.PrintService;
import javax.print.PrintServiceLookup;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ListOfPrintersJTest {
	
	
	private static String getPrinterNames() {
		 String content = "";
		 PrintService[] services = PrintServiceLookup.lookupPrintServices(null, null);
		 
		 content += "Number of print services: " + services.length;
		 content += "\n";
		 
		 if(services.length != 0 || services != null) {
		  int i = 1;
		  for(PrintService service : services) {
		   String name = service.getName();
		   
		   content += "Printer " + i + " name: " + name;
		   content += "\n";
		   i++;
		  }
		 }
		 
		 System.out.println(content);
		 
		 return content;
		}
	
	BufferedWriter writer = null;
	 
	 String printerNames = "";
	 printerNames += getPrinterNames();
	 try {
	  writer = new BufferedWriter(new FileWriter("printer.txt"));
	  writer.write(printerNames);
	  
	  System.out.println("Done!");
	 } catch (IOException e) {
	  e.printStackTrace();
	 } finally {
	  try {
	   if(writer != null) {
	    writer.close();
	   }
	  } catch (Exception ex) {
	   ex.printStackTrace();
	  }
	 }

	@BeforeEach
	void setUp() throws Exception {
	}

	@Test
	void test() {
		fail("Not yet implemented");
	}
	
	

}
