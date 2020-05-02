import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WritingFiles {

	public static void main(String[] args) throws IOException {
		
		//Stream Connectivity
		File f = new File(System.getProperty("user.dir") + "\\src\\MyTextFile.csv" );
		//File f = new File(System.getProperty("user.dir") + "\\src\\MyTextFile.txt" );
		//File f = new File("C:\\Users\\Janielle Gregorio\\Documents\\Java_Tests\\JavaStreams\\src\\MyTextFile.csv");
		//true is append; false is overwrite; false by default
		FileWriter fw = new FileWriter(f, true);
		BufferedWriter writer = new BufferedWriter(fw);
		
		for(int i = 0; i < 4; i++) {
			
			for(int j = 0; j < 3; j++) {
				
				int num = (int)(Math.random() * 100);
				writer.write(num + ",");
				//writer.write(num + "\t");
				
			}
			writer.newLine();
		}
		
		//Writing Inside the File
		/*writer.newLine();
		writer.write("First Line");
		writer.newLine();
		writer.write("Philippines");
		writer.newLine();
		writer.write("Way2Automation");
		writer.newLine();
		writer.write("Janielle");*/
		
		//Closing Stream
		writer.close();
		
		System.out.println("File Created !!!");

	}

}
