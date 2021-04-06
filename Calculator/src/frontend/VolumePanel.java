package frontend;

import java.awt.Color;
import java.awt.ComponentOrientation;
import java.awt.Cursor;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.JTextField;
import javax.swing.border.BevelBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.border.SoftBevelBorder;

/**
 * This  Class represents the Visual Part of the Volume Calculator. Including the slider as well as the output Field.
 * @author Kerim/Robin
 */
public class VolumePanel extends JPanel implements ICalculatorPart{


	private JTextField volumeTextField;
	private Font font;
	
	private JButton leeren;
	private JSlider hoehe;
	private JSlider breite;
	private JSlider tiefe;
	
	/**
	 * @param font The font everything within this {@link VolumePanel} is formated with.
	 * @author Kerim/Robin
	 */
	public VolumePanel(Font font) {
		this.font = font;
		setupPanel();
		setupSlider();
		setupVolumeTextField(); 
		setupButton();
	}

	private void setupPanel() {
		this.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
		this.setToolTipText("volumenrechner");
		this.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		this.setBackground(Color.LIGHT_GRAY);
		this.setBounds(340, 20, 300, 300);
		this.setLayout(null);
	}
	
	private void setupSlider() {
		//-----------------------------------Slider Höhe
		
				hoehe = new JSlider();
				hoehe.setBackground(Color.LIGHT_GRAY);
				hoehe.setBounds(55, 20, 190, 50);
				hoehe.setPaintLabels(true);
				hoehe.setMinorTickSpacing(5);
				hoehe.setMajorTickSpacing(10);
				hoehe.setPaintTicks(true);
				hoehe.setSnapToTicks(true);
				hoehe.setToolTipText("Slider Hoehe");
				hoehe.setValue(0);
				hoehe.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
				hoehe.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
				hoehe.setMaximum(60);
				this.add(hoehe);
				
				JLabel labelHoehe = new JLabel("Hoehe:");
				labelHoehe.setFont(font);
				labelHoehe.setBounds(10, 35, 40, 20);
				this.add(labelHoehe);
				
				JLabel labelHoehe_cm = new JLabel("cm");
				labelHoehe_cm.setFont(font);
				labelHoehe_cm.setBounds(254, 35, 40, 20);
				this.add(labelHoehe_cm);
				
				
				//-----------------------------------Slider Breite

				
				breite = new JSlider();
				breite.setBackground(Color.LIGHT_GRAY);
				breite.setBounds(55, 90, 190, 50);
				breite.setMajorTickSpacing(10);
				breite.setMinorTickSpacing(5);
				breite.setPaintLabels(true);
				breite.setPaintTicks(true);
				breite.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
				breite.setSnapToTicks(true);
				breite.setToolTipText("Slider Breite");
				breite.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
				breite.setMaximum(60);
				breite.setValue(0);
				this.add(breite);
				
				JLabel labelBreite = new JLabel("Breite:");
				labelBreite.setFont(font);
				labelBreite.setBounds(10, 105, 40, 16);
				this.add(labelBreite);
				
				JLabel labelBreite_cm = new JLabel("cm");
				labelBreite_cm.setFont(font);
				labelBreite_cm.setBounds(254, 105, 40, 16);
				this.add(labelBreite_cm);
				
				
				//-----------------------------------Slider Tiefe

				
				tiefe = new JSlider();
				tiefe.setBackground(Color.LIGHT_GRAY);
				tiefe.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
				tiefe.setBounds(55, 160, 190, 50);
				tiefe.setValue(0);
				tiefe.setToolTipText("Slider Tiefe");
				tiefe.setSnapToTicks(true);
				tiefe.setPaintTicks(true);
				tiefe.setPaintLabels(true);
				tiefe.setMinorTickSpacing(5);
				tiefe.setMaximum(60);
				tiefe.setMajorTickSpacing(10);
				tiefe.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
				this.add(tiefe);
				
				JLabel labelTiefe = new JLabel("Tiefe:");
				labelTiefe.setFont(font);
				labelTiefe.setBounds(10, 175, 40, 16);
				this.add(labelTiefe);
				
				JLabel labelTiefe_cm = new JLabel("cm");
				labelTiefe_cm.setFont(font);
				labelTiefe_cm.setBounds(254, 175, 40, 16);
				this.add(labelTiefe_cm);

	}

	public void setupVolumeTextField() {
		volumeTextField = new JTextField();
		volumeTextField.setToolTipText("Ergebnis in Kubikcentimeter ");
		volumeTextField.setEditable(false);
		volumeTextField.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
		volumeTextField.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		volumeTextField.setBounds(65, 220, 170, 30);
		volumeTextField.setColumns(10);
		this.add(volumeTextField);
		
		JLabel labelErgebnis = new JLabel("Ergebnis:");
		labelErgebnis.setFont(font);
		labelErgebnis.setBounds(10, 227, 58, 16);
		this.add(labelErgebnis);
		
		JLabel labelErgebnis_cm = new JLabel("cm^3");
		labelErgebnis_cm.setFont(new Font("Lucida Grande", Font.PLAIN, 10));
		labelErgebnis_cm.setBounds(254, 227, 40, 16);
		this.add(labelErgebnis_cm);
	}

	private void setupButton() {
		leeren = new JButton("Leeren");
		leeren.setToolTipText("Löscht das Ergebnis und stellt alles zurück auf Null");
		leeren.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		leeren.setBounds(61, 255, 179, 29);
		this.add(leeren);
	}
	
	public JTextField getVolumeTextField() {
		return volumeTextField;
	}

	public JButton getLeeren() {
		return leeren;
	}

	public JSlider getHoehe() {
		return hoehe;
	}

	public JSlider getBreite() {
		return breite;
	}

	public JSlider getTiefe() {
		return tiefe;
	}

	@Override
	public JLabel getLabel() {
		JLabel labelVolume = new JLabel("Volumenrechner:");
		labelVolume.setBounds(340, 5, 106, 16);
		return labelVolume;
	}
	
}
