package frontend;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.SystemColor;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.border.BevelBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.border.SoftBevelBorder;

/**
 * This Class represents the Visual Part of the Calculator. Including the
 * Buttons for the Digits, Operators, etc. as well as the output Field.
 * 
 * @author Kerim/Robin
 *
 */
public class CalculatorPanel extends JPanel implements ICalculatorPart {

	private JTextField calculatorTextField;
	private Font font;

	/**
	 * 
	 * @param font The font everything within this {@link CalculatorPanel} is
	 *             formated with.
	 * @author Kerim/Robin
	 */
	public CalculatorPanel(Font font) {
		this.font = font;
		setupPanel();
		setupCalculatorTextField();
		setupButtons();
		this.add(calculatorTextField);
	}

	private void setupPanel() {
		this.setToolTipText("Taschenrechner");
		this.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		this.setBackground(Color.LIGHT_GRAY);
		this.setBounds(20, 20, 300, 300);
		this.setLayout(null);
	}

	private void setupCalculatorTextField() {
		calculatorTextField = new JTextField();
		calculatorTextField.setFont(font);
		calculatorTextField.setHorizontalAlignment(SwingConstants.RIGHT);
		calculatorTextField.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		calculatorTextField.setBounds(10, 10, 280, 40);
		calculatorTextField.setColumns(10);
		calculatorTextField.setEditable(false);
	}

	private void setupButtons() {
		// ------------------------------------------------------------------ Button 0

		JButton button_0 = new JButton("0");
		button_0.setFont(font);
		button_0.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		button_0.setBackground(SystemColor.window);
		button_0.setBounds(81, 190, 75, 40);
		this.add(button_0);

		// ------------------------------------------------------------------ Button 1

		JButton button_1 = new JButton("1");
		button_1.setFont(font);
		button_1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		button_1.setBackground(SystemColor.window);
		button_1.setBounds(6, 150, 75, 40);
		this.add(button_1);

		// ------------------------------------------------------------------ Button 2

		JButton button_2 = new JButton("2");
		button_2.setFont(font);
		button_2.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		button_2.setBackground(SystemColor.window);
		button_2.setBounds(81, 150, 75, 40);
		this.add(button_2);

		// ------------------------------------------------------------------ Button 3

		JButton button_3 = new JButton("3");
		button_3.setFont(font);
		button_3.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		button_3.setBackground(SystemColor.window);
		button_3.setBounds(156, 150, 75, 40);
		this.add(button_3);

		// ------------------------------------------------------------------ Button 4

		JButton button_4 = new JButton("4");
		button_4.setFont(font);
		button_4.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		button_4.setBackground(SystemColor.window);
		button_4.setBounds(6, 110, 75, 40);
		this.add(button_4);

		// ------------------------------------------------------------------ Button 5

		JButton button_5 = new JButton("5");
		button_5.setFont(font);
		button_5.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		button_5.setBackground(SystemColor.window);
		button_5.setBounds(81, 110, 75, 40);
		this.add(button_5);

		// ------------------------------------------------------------------ Button 6

		JButton button_6 = new JButton("6");
		button_6.setFont(font);
		button_6.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		button_6.setBackground(SystemColor.window);
		button_6.setBounds(156, 110, 75, 40);
		this.add(button_6);

		// ------------------------------------------------------------------ Button 7

		JButton button_7 = new JButton("7");
		button_7.setFont(font);
		button_7.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		button_7.setBackground(SystemColor.window);
		button_7.setBounds(6, 70, 75, 40);
		this.add(button_7);

		// ------------------------------------------------------------------ Button 8

		JButton button_8 = new JButton("8");
		button_8.setFont(font);
		button_8.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		button_8.setBackground(SystemColor.window);
		button_8.setBounds(81, 70, 75, 40);
		this.add(button_8);

		// ------------------------------------------------------------------ Button 9

		JButton button_9 = new JButton("9");
		button_9.setFont(font);
		button_9.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		button_9.setBackground(SystemColor.window);
		button_9.setBounds(156, 70, 75, 40);
		this.add(button_9);

		// ------------------------------------------------------------------ Button
		// Plus

		JButton button_plus = new JButton("+");
		button_plus.setFont(font);
		button_plus.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		button_plus.setBackground(SystemColor.window);
		button_plus.setBounds(235, 70, 59, 40);
		this.add(button_plus);

		// ------------------------------------------------------------------ Button
		// Minus

		JButton button_minus = new JButton("-");
		button_minus.setFont(font);
		button_minus.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		button_minus.setBackground(SystemColor.window);
		button_minus.setBounds(235, 110, 59, 40);
		this.add(button_minus);

		// ------------------------------------------------------------------ Button Mal

		JButton button_mal = new JButton("*");
		button_mal.setFont(font);
		button_mal.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		button_mal.setBackground(SystemColor.window);
		button_mal.setBounds(235, 150, 59, 40);
		this.add(button_mal);

		// ------------------------------------------------------------------ Button
		// Durch

		JButton button_durch = new JButton("/");
		button_durch.setFont(font);
		button_durch.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		button_durch.setBackground(SystemColor.window);
		button_durch.setBounds(235, 190, 59, 40);
		this.add(button_durch);

		// ------------------------------------------------------------------ Button
		// Gleich

		JButton button_gleich = new JButton("=");
		button_gleich.setFont(font);
		button_gleich.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		button_gleich.setBackground(SystemColor.window);
		button_gleich.setBounds(235, 229, 59, 40);
		this.add(button_gleich);

		// ------------------------------------------------------------------ Button
		// Clear

		JButton button_clear = new JButton("Clear");
		button_clear.setFont(font);
		button_clear.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		button_clear.setBackground(SystemColor.window);
		button_clear.setBounds(6, 229, 75, 40);
		this.add(button_clear);

		// ------------------------------------------------------------------ Button
		// Punkt

		JButton button_dot = new JButton(".");
		button_dot.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		button_dot.setFont(font);
		button_dot.setBackground(SystemColor.window);
		button_dot.setBounds(156, 229, 75, 40);
		this.add(button_dot);

		// ------------------------------------------------------------------ Button
		// Back

		JButton button_back = new JButton("<-");
		button_back.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		button_back.setFont(font);
		button_back.setBackground(SystemColor.window);
		button_back.setBounds(81, 229, 75, 40);
		this.add(button_back);

	}

	@Override
	public JLabel getLabel() {
		JLabel label = new JLabel("Taschenrechner");
		label.setBounds(20, 5, 106, 16);
		return label;
	}
}
