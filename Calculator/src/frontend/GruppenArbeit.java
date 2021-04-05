package frontend;
import java.awt.*;
import javax.swing.*;
import javax.swing.JTextArea;
import javax.swing.JMenuBar;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.UIManager;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;
import javax.swing.JMenu;
import javax.swing.SwingConstants;
import javax.swing.border.EtchedBorder;
import javax.swing.JMenuItem;
import javax.swing.JTextField;
import javax.swing.JButton;




public class GruppenArbeit {

	/**
	 * Eigenschaften / Attrubute
	 */
	private JFrame gruppenarbeit;
	private JPanel panelTextArea;
	private JTextField rechnerFeld;
	private JTextField volumenFeld;
	
	
	/**
	 * Main
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GruppenArbeit window = new GruppenArbeit();
					window.gruppenarbeit.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Konstruktor
	 */
	public GruppenArbeit() {
		initialize();
	}

	/**
	 * Methoden
	 */
	
	
	
		//------------------------------------------------------------------------------------ Fenster ------------------------------------------------------------------------------

	
	private void initialize() { 															// Fenster erstellen
		gruppenarbeit = new JFrame();														// Objekt frame erstellen
		gruppenarbeit.setResizable(false);
		gruppenarbeit.setForeground(new Color(192, 192, 192));
		gruppenarbeit.getContentPane().setBackground(new Color(192, 192, 192));
		gruppenarbeit.setTitle("Java 2 Gruppenarbeit von Robin, Oliver & Kerim");			// Tittel stzen
		gruppenarbeit.setBounds(100, 100, 660, 710);										// Fenstergrösse setzen
		gruppenarbeit.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		gruppenarbeit.getContentPane().setLayout(null);
	
		
		//------------------------------------------------------------------------------------ MenuBar ------------------------------------------------------------------------------
		
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setMargin(new Insets(0, 20, 0, 0));
		gruppenarbeit.setJMenuBar(menuBar);
		
		JMenu menu = new JMenu();
		menu.setBorder(UIManager.getBorder("MenuBar.border"));
		menu.setText("Datei");
		menuBar.add(menu);
		
		JMenuItem menuItem = new JMenuItem("Ausgabe leeren");
		menuItem.setFocusPainted(true);
		menuItem.setFocusable(true);
		menu.add(menuItem);
		
		
		//------------------------------------------------------------------------------------ Taschenrechner -----------------------------------------------------------------------
		
		
		JPanel taschenrechner = new JPanel();
		taschenrechner.setToolTipText("Taschenrechner");
		taschenrechner.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		taschenrechner.setBackground(Color.LIGHT_GRAY);
		taschenrechner.setBounds(20, 20, 300, 300);
		gruppenarbeit.getContentPane().add(taschenrechner);
		taschenrechner.setLayout(null);
		
		rechnerFeld = new JTextField();
		rechnerFeld.setFont(new Font("Lucida Grande", Font.PLAIN, 17));
		rechnerFeld.setHorizontalAlignment(SwingConstants.RIGHT);
		rechnerFeld.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		rechnerFeld.setBounds(10, 10, 280, 40);
		taschenrechner.add(rechnerFeld);
		rechnerFeld.setColumns(10);
		
		JLabel labelRechner = new JLabel("Taschenrechner");
		labelRechner.setBounds(20, 5, 106, 16);
		gruppenarbeit.getContentPane().add(labelRechner);
		
		
		//------------------------------------------------------------------ Button 0
		
		
		JButton button_0 = new JButton("0");
		button_0.setFont(new Font("Lucida Grande", Font.PLAIN, 17));
		button_0.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		button_0.setBackground(SystemColor.window);
		button_0.setBounds(81, 190, 75, 40);
		taschenrechner.add(button_0);
		
		
		//------------------------------------------------------------------ Button 1

		
		JButton button_1 = new JButton("1");
		button_1.setFont(new Font("Lucida Grande", Font.PLAIN, 17));
		button_1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		button_1.setBackground(SystemColor.window);
		button_1.setBounds(6, 150, 75, 40);
		taschenrechner.add(button_1);
		
		
		//------------------------------------------------------------------ Button 2

		
		JButton button_2 = new JButton("2");
		button_2.setFont(new Font("Lucida Grande", Font.PLAIN, 17));
		button_2.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		button_2.setBackground(SystemColor.window);
		button_2.setBounds(81, 150, 75, 40);
		taschenrechner.add(button_2);
		
		
		//------------------------------------------------------------------ Button 3

		
		JButton button_3 = new JButton("3");
		button_3.setFont(new Font("Lucida Grande", Font.PLAIN, 17));
		button_3.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		button_3.setBackground(SystemColor.window);
		button_3.setBounds(156, 150, 75, 40);
		taschenrechner.add(button_3);
		
		
		//------------------------------------------------------------------ Button 4

		
		JButton button_4 = new JButton("4");
		button_4.setFont(new Font("Lucida Grande", Font.PLAIN, 17));
		button_4.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		button_4.setBackground(SystemColor.window);
		button_4.setBounds(6, 110, 75, 40);
		taschenrechner.add(button_4);
		
		
		//------------------------------------------------------------------ Button 5
		
		
		JButton button_5 = new JButton("5");
		button_5.setFont(new Font("Lucida Grande", Font.PLAIN, 17));
		button_5.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		button_5.setBackground(SystemColor.window);
		button_5.setBounds(81, 110, 75, 40);
		taschenrechner.add(button_5);
		
		
		//------------------------------------------------------------------ Button 6

		
		JButton button_6 = new JButton("6");
		button_6.setFont(new Font("Lucida Grande", Font.PLAIN, 17));
		button_6.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		button_6.setBackground(SystemColor.window);
		button_6.setBounds(156, 110, 75, 40);
		taschenrechner.add(button_6);

		
		//------------------------------------------------------------------ Button 7

		
		JButton button_7 = new JButton("7");
		button_7.setFont(new Font("Lucida Grande", Font.PLAIN, 17));
		button_7.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		button_7.setBackground(UIManager.getColor("Button.highlight"));
		button_7.setBounds(6, 70, 75, 40);
		taschenrechner.add(button_7);
		
		
		//------------------------------------------------------------------ Button 8

		
		JButton button_8 = new JButton("8");
		button_8.setFont(new Font("Lucida Grande", Font.PLAIN,17));
		button_8.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		button_8.setBackground(SystemColor.window);
		button_8.setBounds(81, 70, 75, 40);
		taschenrechner.add(button_8);
		
		
		//------------------------------------------------------------------ Button 9
		
		
		JButton button_9 = new JButton("9");
		button_9.setFont(new Font("Lucida Grande", Font.PLAIN, 17));
		button_9.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		button_9.setBackground(SystemColor.window);
		button_9.setBounds(156, 70, 75, 40);
		taschenrechner.add(button_9);
	
		
		//------------------------------------------------------------------ Button Plus

		
		JButton button_plus = new JButton("+");
		button_plus.setFont(new Font("Lucida Grande", Font.PLAIN, 17));
		button_plus.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		button_plus.setBackground(SystemColor.window);
		button_plus.setBounds(235, 70, 59, 40);
		taschenrechner.add(button_plus);
		
		
		//------------------------------------------------------------------ Button Minus
		
		
		JButton button_minus = new JButton("-");
		button_minus.setFont(new Font("Lucida Grande", Font.PLAIN, 17));
		button_minus.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		button_minus.setBackground(SystemColor.window);
		button_minus.setBounds(235, 110, 59, 40);
		taschenrechner.add(button_minus);
	
		
		//------------------------------------------------------------------ Button Mal
		
		
		JButton button_mal = new JButton("*");
		button_mal.setFont(new Font("Lucida Grande", Font.PLAIN, 17));
		button_mal.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		button_mal.setBackground(SystemColor.window);
		button_mal.setBounds(235, 150, 59, 40);
		taschenrechner.add(button_mal);
	
		
		//------------------------------------------------------------------ Button Durch
		
		
		JButton button_durch = new JButton("/");
		button_durch.setFont(new Font("Lucida Grande", Font.PLAIN, 17));
		button_durch.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		button_durch.setBackground(SystemColor.window);
		button_durch.setBounds(235, 190, 59, 40);
		taschenrechner.add(button_durch);
		
		
		//------------------------------------------------------------------ Button Gleich

		
		JButton button_gleich = new JButton("=");
		button_gleich.setFont(new Font("Lucida Grande", Font.PLAIN, 17));
		button_gleich.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		button_gleich.setBackground(SystemColor.window);
		button_gleich.setBounds(235, 229, 59, 40);
		taschenrechner.add(button_gleich);
		
		
		//------------------------------------------------------------------ Button Clear

		
		JButton button_clear = new JButton("Clear");
		button_clear.setFont(new Font("Lucida Grande", Font.PLAIN, 17));
		button_clear.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		button_clear.setBackground(SystemColor.window);
		button_clear.setBounds(6, 229, 75, 40);
		taschenrechner.add(button_clear);
		
		
		//------------------------------------------------------------------ Button Punkt
		
		
		JButton button_dot = new JButton(".");
		button_dot.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		button_dot.setFont(new Font("Lucida Grande", Font.PLAIN, 17));
		button_dot.setBackground(SystemColor.window);
		button_dot.setBounds(156, 229, 75, 40);
		taschenrechner.add(button_dot);
		
		
		//------------------------------------------------------------------ Button Back

		JButton button_back = new JButton("<-");
		button_back.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		button_back.setFont(new Font("Lucida Grande", Font.PLAIN, 17));
		button_back.setBackground(SystemColor.window);
		button_back.setBounds(81, 229, 75, 40);
		taschenrechner.add(button_back);

	
	//------------------------------------------------------------------------------------ Volumenberechnung --------------------------------------------------------------------

		
		JPanel volume = new JPanel();
		volume.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
		volume.setToolTipText("Volumenrechner");
		volume.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		volume.setBackground(Color.LIGHT_GRAY);
		volume.setBounds(340, 20, 300, 300);
		gruppenarbeit.getContentPane().add(volume);
		volume.setLayout(null);
		
		JLabel labelVolume = new JLabel("Volumenrechner:");
		labelVolume.setBounds(340, 5, 106, 16);
		gruppenarbeit.getContentPane().add(labelVolume);
		
		
		//-----------------------------------Slider Höhe
		
		JSlider slider_hoehe = new JSlider();
		slider_hoehe.setBounds(55, 20, 190, 50);
		slider_hoehe.setPaintLabels(true);
		slider_hoehe.setMinorTickSpacing(5);
		slider_hoehe.setMajorTickSpacing(10);
		slider_hoehe.setPaintTicks(true);
		slider_hoehe.setSnapToTicks(true);
		slider_hoehe.setToolTipText("Slider Hoehe");
		slider_hoehe.setValue(0);
		slider_hoehe.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		slider_hoehe.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
		slider_hoehe.setMaximum(60);
		volume.add(slider_hoehe);
		
		JLabel labelHoehe = new JLabel("Hoehe:");
		labelHoehe.setFont(new Font("Lucida Grande", Font.PLAIN, 10));
		labelHoehe.setBounds(10, 35, 40, 20);
		volume.add(labelHoehe);
		
		JLabel labelHoehe_cm = new JLabel("cm");
		labelHoehe_cm.setFont(new Font("Lucida Grande", Font.PLAIN, 10));
		labelHoehe_cm.setBounds(254, 35, 40, 20);
		volume.add(labelHoehe_cm);
		
		
		//-----------------------------------Slider Breite

		
		JSlider slider_breite = new JSlider();
		slider_breite.setBounds(55, 90, 190, 50);
		slider_breite.setMajorTickSpacing(10);
		slider_breite.setMinorTickSpacing(5);
		slider_breite.setPaintLabels(true);
		slider_breite.setPaintTicks(true);
		slider_breite.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		slider_breite.setSnapToTicks(true);
		slider_breite.setToolTipText("Slider Breite");
		slider_breite.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
		slider_breite.setMaximum(60);
		slider_breite.setValue(0);
		volume.add(slider_breite);
		
		JLabel labelBreite = new JLabel("Breite:");
		labelBreite.setFont(new Font("Lucida Grande", Font.PLAIN, 10));
		labelBreite.setBounds(10, 105, 40, 16);
		volume.add(labelBreite);
		
		JLabel labelBreite_cm = new JLabel("cm");
		labelBreite_cm.setFont(new Font("Lucida Grande", Font.PLAIN, 10));
		labelBreite_cm.setBounds(254, 105, 40, 16);
		volume.add(labelBreite_cm);
		
		
		//-----------------------------------Slider Tiefe

		
		JSlider slider_tiefe = new JSlider();
		slider_tiefe.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		slider_tiefe.setBounds(55, 160, 190, 50);
		slider_tiefe.setValue(0);
		slider_tiefe.setToolTipText("Slider Tiefe");
		slider_tiefe.setSnapToTicks(true);
		slider_tiefe.setPaintTicks(true);
		slider_tiefe.setPaintLabels(true);
		slider_tiefe.setMinorTickSpacing(5);
		slider_tiefe.setMaximum(60);
		slider_tiefe.setMajorTickSpacing(10);
		slider_tiefe.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
		volume.add(slider_tiefe);
		
		JLabel labelTiefe = new JLabel("Tiefe:");
		labelTiefe.setFont(new Font("Lucida Grande", Font.PLAIN, 10));
		labelTiefe.setBounds(10, 175, 40, 16);
		volume.add(labelTiefe);
		
		JLabel labelTiefe_cm = new JLabel("cm");
		labelTiefe_cm.setFont(new Font("Lucida Grande", Font.PLAIN, 10));
		labelTiefe_cm.setBounds(254, 175, 40, 16);
		volume.add(labelTiefe_cm);
		
		
		//-----------------------------------Ergebnis Feld und Leeren Button

		
		volumenFeld = new JTextField();
		volumenFeld.setToolTipText("Ergebnis in Kubikcentimeter ");
		volumenFeld.setEditable(false);
		volumenFeld.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
		volumenFeld.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		volumenFeld.setBounds(65, 220, 170, 30);
		volume.add(volumenFeld);
		volumenFeld.setColumns(10);
		
		JLabel labelErgebnis = new JLabel("Ergebnis:");
		labelErgebnis.setFont(new Font("Lucida Grande", Font.PLAIN, 10));
		labelErgebnis.setBounds(10, 227, 58, 16);
		volume.add(labelErgebnis);
		
		JLabel labelErgebnis_cm = new JLabel("cm^3");
		labelErgebnis_cm.setFont(new Font("Lucida Grande", Font.PLAIN, 10));
		labelErgebnis_cm.setBounds(254, 227, 40, 16);
		volume.add(labelErgebnis_cm);
		
		JButton button_leeren = new JButton("Leeren");
		button_leeren.setToolTipText("Löscht das Ergebnis und stellt alles zurück auf Null");
		button_leeren.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		button_leeren.setBounds(61, 255, 179, 29);
		volume.add(button_leeren);
		
	
		//------------------------------------------------------------------------------------ Berechnungs Anzeige --------------------------------------------------------------------

		
		panelTextArea = new JPanel();
		panelTextArea.setBounds(20, 340, 620, 295);
		panelTextArea.setBackground(new Color(192, 192, 192));
		panelTextArea.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		gruppenarbeit.getContentPane().add(panelTextArea);
		panelTextArea.setLayout(null);
		
		JLabel labelBerechnungsanzeige = new JLabel("Hier werden alle Berechnungen angezeigt:");
		labelBerechnungsanzeige.setBounds(20, 324, 267, 16);
		gruppenarbeit.getContentPane().add(labelBerechnungsanzeige);
		
		
		//----------------------------------- Scroll Feld wird erzeugt

		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(6, 6, 608, 283);
		panelTextArea.add(scrollPane);
		
		
		//----------------------------------- Text Feld wird in Scroll Feld eingefügt 

		
		JTextArea textArea = new JTextArea();
		textArea.setEditable(false);
		scrollPane.setViewportView(textArea);
		textArea.setDropMode(DropMode.INSERT);
		textArea.setDragEnabled(false);
		textArea.setAutoscrolls(false);
		textArea.setInheritsPopupMenu(true);
		textArea.setWrapStyleWord(true);
		textArea.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
		textArea.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		textArea.setToolTipText("Dies ist der Bereich welche die Berechnungen anzeigt");
		
		
		//----------------------------------- Fusszeilen Label
		
		
		JLabel labelCopyright = new JLabel("Copyright © 2021 Gruppe 3. All Rights Reserved");
		labelCopyright.setBounds(175, 638, 310, 16);
		gruppenarbeit.getContentPane().add(labelCopyright);
		
		
		//------------------------------------------------------------------------------------ Taschenrechner beginn Tasten Funktionen-----------------------------------------------------------------------
		
		
		button_0.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			rechnerFeld.setText(rechnerFeld.getText() + "0");
		}
		});
		
		
		button_1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				rechnerFeld.setText(rechnerFeld.getText() + "1");
			}
		});
		
		
		button_2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				rechnerFeld.setText(rechnerFeld.getText() + "2");
			}
		});

		
		button_3.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				rechnerFeld.setText(rechnerFeld.getText() + "3");
			}
		});
		
		
		button_4.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				rechnerFeld.setText(rechnerFeld.getText() + "4");
			}
		});
		
		
		button_5.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				rechnerFeld.setText(rechnerFeld.getText() + "5");
			}
		});
	
		
		button_6.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				rechnerFeld.setText(rechnerFeld.getText() + "6");
			}
		});


		button_7.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				rechnerFeld.setText(rechnerFeld.getText() + "7");
			}
		});
		

		button_8.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				rechnerFeld.setText(rechnerFeld.getText() + "8");
			}
		});
		
		
		button_9.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				rechnerFeld.setText(rechnerFeld.getText() + "9");
			}
		});
		

		button_dot.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				rechnerFeld.setText(rechnerFeld.getText() + ".");
			}
		});

		
		button_plus.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				num = Double.parseDouble(rechnerFeld.getText());
				calculation = 1;
				rechnerFeld.setText(" ");
				textArea.setText(num + "+");
			}
		});	
		
		
		button_minus.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				num = Double.parseDouble(rechnerFeld.getText());
				calculation = 2;
				rechnerFeld.setText(" ");
				textArea.setText(num + "-");
			}
		});
		
		
		button_mal.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				num = Double.parseDouble(rechnerFeld.getText());
				calculation = 3;
				rechnerFeld.setText(" ");
				textArea.setText(num + "*");
			}
		});
		

		button_durch.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				num = Double.parseDouble(rechnerFeld.getText());
				calculation = 4;
				rechnerFeld.setText(" ");
				textArea.setText(num + "/");
			}
		});
		

		button_gleich.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				arithmetische_operationen();
				textArea.setText(" ");
				}
		});
		

		button_clear.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				rechnerFeld.setText(" ");
			}
		});
		
		
		button_back.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				int length = rechnerFeld.getText().length();
				int number = rechnerFeld.getText().length() - 1;
				String store;
				
				if (length > 0) {
					StringBuilder back = new StringBuilder(rechnerFeld.getText());
					back.deleteCharAt(number);
					store = back.toString();
					rechnerFeld.setText(store);
				}
			}
		});
		
		
		//------------------------------------------------------------------------------------ Taschenrechner ende Tasten Funktionen -----------------------------------------------------------------------
		
		
	}	//----------------------------------- Ende initialize()

	
	
	
		//------------------------------------------------------------------------------------ Beginn Arithmetische Funktionen Taschenrechner---------------------------------------------------------------

	
	double num,ans;
	int calculation;
	
	public void arithmetische_operationen(){
		
		switch (calculation) {
		
		case 1: // Addition
			
			ans = num + Double.parseDouble(rechnerFeld.getText());
			rechnerFeld.setText(Double.toString(ans));
			break;
			
		case 2: // Subtraktion
			
			ans = num - Double.parseDouble(rechnerFeld.getText());
			rechnerFeld.setText(Double.toString(ans));
			break;
		
		case 3: // Multiplication
			
			ans = num * Double.parseDouble(rechnerFeld.getText());
			rechnerFeld.setText(Double.toString(ans));
			break;
			
		case 4: // Division
			
			ans = num / Double.parseDouble(rechnerFeld.getText());
			rechnerFeld.setText(Double.toString(ans));
			break;
		
		default:
			throw new IllegalArgumentException("Unexpected value: " + calculation);
		}
	
	}	//------------------------------------------------------------------------------------ Ende Arithmetische Funktionen Taschenrechner---------------------------------------------------------------

	
	
}		//----------------------------------- Ende Klasse Gruppenarbeit

