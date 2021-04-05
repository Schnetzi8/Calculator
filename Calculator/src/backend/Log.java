package backend;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JMenuItem;
import javax.swing.JTextArea;

import frontend.LogPanel;

/**
 * The {@link Log} class handles the logging onto the Logging {@link JTextArea} and into the log file
 * @author Robin
 *
 */
public class Log {
	
	private JTextArea textArea;
	private OutputFile file;
	
	/**
	 *@author Robin
	 */
	public Log(LogPanel panel, JMenuItem ausgabeLeeren, OutputFile file) {
		this.file = file;
		this.textArea = panel.getLogTextArea();
		textArea.setText(file.getContent());
		
		ausgabeLeeren.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				file.clear();
				textArea.setText("");
			}
		});
	}
	/**
	 * prints a new entry into the Log and Log File
	 * @author Robin
	 * @param num1 the first number of the calculation
	 * @param num2 the second number of the calculation
	 * @param sign the sign of the operation
	 * @param result the result of the operation
	 */
	public void print(double num1, double num2, String sign, double result) {
		textArea.append("\n" + num1 + "	" + sign + "	" + num2 + "	" + "=" + "	" + result);
		file.addEntry(num1, sign, num2, result);
	}
	
}
