import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WritingHTML {

	public static void main(String[] args) throws IOException {
		
		//Stream Connectivity
		File f = new File(System.getProperty("user.dir") + "\\src\\SampleHTMLFile.html" );
		//File f = new File("C:\\Users\\Janielle Gregorio\\Documents\\Java_Tests\\JavaStreams\\src\\MyTextFile.csv");
		//true is append; false is overwrite; false by default
		FileWriter fw = new FileWriter(f, true);
		BufferedWriter writer = new BufferedWriter(fw);
		
		writer.write("<html><body><title>Writing HTML Files</title><h1>Selenium WebDriver using Java</h1></body></html>");
		
		//Closing Stream
		writer.close();
		
		System.out.println("File Created !!!");

	}

}
