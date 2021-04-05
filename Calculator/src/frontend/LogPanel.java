package frontend;

import java.awt.Color;
import java.awt.ComponentOrientation;
import java.awt.Font;

import javax.swing.DropMode;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.border.BevelBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.border.SoftBevelBorder;

/**
 * This Class represents the Visual Part of the Log.
 * 
 * @author Kerim/Robin
 *
 */
public class LogPanel extends JPanel implements ICalculatorPart {

	private JTextArea logTextArea;

	/**
	 * @param font The font everything within this {@link VolumePanel} is formated
	 *             with.
	 * @author Kerim/Robin
	 */
	public LogPanel() {
		setupPanel();
		setupTextArea();
	}

	private void setupPanel() {
		this.setBounds(20, 340, 620, 295);
		this.setBackground(new Color(192, 192, 192));
		this.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		this.setLayout(null);
	}

	private void setupTextArea() {
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(6, 6, 608, 283);
		this.add(scrollPane);
		
		logTextArea = new JTextArea();
		logTextArea.setEditable(false);
		scrollPane.setViewportView(logTextArea);
		logTextArea.setDropMode(DropMode.INSERT);
		logTextArea.setDragEnabled(false);
		logTextArea.setAutoscrolls(false);
		logTextArea.setInheritsPopupMenu(true);
		logTextArea.setWrapStyleWord(true);
		logTextArea.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
		logTextArea.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		logTextArea.setToolTipText("Dies ist der Bereich welcher die Berechnungen anzeigt");
		
		
	}

	@Override
	public JLabel getLabel() {
		JLabel labelBerechnungsanzeige = new JLabel("Hier werden alle Berechnungen angezeigt:");
		labelBerechnungsanzeige.setBounds(20, 324, 267, 16);
		return labelBerechnungsanzeige;
	}

}
