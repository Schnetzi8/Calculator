package backend;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;

/**
 * The {@link OutputFile} represents the log file
 * 
 * @author robin
 *
 */
public class OutputFile {

	FileSystem fs = FileSystems.getDefault();
	PrintWriter out;
	BufferedReader in;
	Path path;

	/**	
	 * @author Robin
	 */
	public OutputFile(String name) {
		try {
			path = fs.getPath(name + ".txt");
			out = new PrintWriter(new BufferedWriter(new FileWriter(name + ".txt", true)));
			in = Files.newBufferedReader(path);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	/**
	 * @author Robin
	 * @return Everything in the file
	 */
	public String getContent() {
		if (!Files.exists(path)) {
			return "!";
		}
		try {
			String nextLine;
			StringBuffer sb = new StringBuffer();
			while ((nextLine = in.readLine()) != null) {
		        sb.append(nextLine + "\n");
		    }
			return sb.toString();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return "";
	}
	
	/**
	 * adds another operation to the log file
	 * @param num1 first number of the operation
	 * @param sign the symbol of the operation
	 * @param num2 second number of the operation
	 * @param result the result of the operatioon
	 * @author Robin
	 */
	public void addEntry(double num1, String sign, double num2, double result) {
		out.print("\n" + num1 + "	" + sign + "	" + num2 + "	" + "=" + "	" + result);
		out.flush();
	}
	
	/**
	 * Clears the file of all contents
	 * @author Robin
	 */
	public void clear() {
		try {
			Files.newBufferedWriter(path);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
