package frontend;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.Insets;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.UIManager;

/**
 * This class represents the Visual Window seen by the user.
 * 
 * @author Kerim/Robin
 *
 */
public class CalculatorWindow {

	private JFrame window;
	private JMenuBar menuBar;
	private Container contentPane;
	private JMenuItem ausgabeLeeren;

	private CalculatorPanel calculatorPanel;
	private VolumePanel volumePanel;
	private LogPanel logPanel;
	private JLabel copyrightL = new JLabel("<html><body>&copy;</body></html>");

	/**
	 * @author Kerim/Robin
	 */
	public CalculatorWindow() {
		setupWindow();
		contentPane = window.getContentPane();
		setupMenuBar();
		setupCopyrightLabel();

		contentPane.add(calculatorPanel = new CalculatorPanel(new Font("Lucida Grande", Font.PLAIN, 17)));
		contentPane.add(calculatorPanel.getLabel());
		contentPane.add(volumePanel = new VolumePanel(new Font("Lucida Grande", Font.PLAIN, 10)));
		contentPane.add(volumePanel.getLabel());
		contentPane.add(logPanel = new LogPanel());
		contentPane.add(logPanel.getLabel());
		window.setVisible(true);
	}

	private void setupWindow() {
		window = new JFrame();
		window.setResizable(false);
		window.setForeground(new Color(192, 192, 192));
		window.getContentPane().setBackground(new Color(192, 192, 192));
		window.setTitle("Java 2 Gruppenarbeit von Robin, Oliver & Kerim"); // Titel setzen
		window.setBounds(100, 100, 660, 720); // Fenstergr√∂sse setzen
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.getContentPane().setLayout(null);
	}

	private void setupMenuBar() {
		menuBar = new JMenuBar();
		menuBar.setMargin(new Insets(0, 20, 0, 0));
		window.setJMenuBar(menuBar);

		JMenu menu = new JMenu();
		menu.setBorder(UIManager.getBorder("MenuBar.border"));
		menu.setText("Datei");
		menuBar.add(menu);

		ausgabeLeeren = new JMenuItem("Ausgabe leeren");
		ausgabeLeeren.setFocusPainted(true);
		ausgabeLeeren.setFocusable(true);
		menu.add(ausgabeLeeren);
	}

	private void setupCopyrightLabel() {
		JLabel labelCopyright = new JLabel("Copyright © 2021 Gruppe 3. All Rights Reserved");
		labelCopyright.setBounds(175, 638, 310, 16);
		contentPane.add(labelCopyright);
	}

	public CalculatorPanel getCalculatorPanel() {
		return calculatorPanel;
	}

	public VolumePanel getVolumePanel() {
		return volumePanel;
	}

	public LogPanel getLogPanel() {
		return logPanel;
	}

	public JMenuItem getAusgabeLeeren() {
		return ausgabeLeeren;
	}

}
