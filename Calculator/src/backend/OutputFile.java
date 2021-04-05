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
			in = Files.newBufferedReader(path);
			out = new PrintWriter(new BufferedWriter(new FileWriter(name + ".txt", true)));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

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
	
	public void addEntry(double num1, String sign, double num2, double result) {
		out.print("\n" + num1 + "	" + sign + "	" + num2 + "	" + "=" + "	" + result);
		out.flush();
	}

	public void clear() {
		try {
			Files.newBufferedWriter(path);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
