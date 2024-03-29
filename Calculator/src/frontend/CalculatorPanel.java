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

	private JButton button_0;
	private JButton button_1;
	private JButton button_2;
	private JButton button_3;
	private JButton button_4;
	private JButton button_5;
	private JButton button_6;
	private JButton button_7;
	private JButton button_8;
	private JButton button_9;

	private JButton button_plus;
	private JButton button_minus;
	private JButton button_mal;
	private JButton button_durch;
	
	private JButton button_gleich;
	private JButton button_dot;
	private JButton button_clear;
	private JButton button_back;

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

		button_0 = new JButton("0");
		button_0.setFont(font);
		button_0.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		button_0.setBackground(SystemColor.window);
		button_0.setBounds(81, 190, 75, 40);
		this.add(button_0);

		// ------------------------------------------------------------------ Button 1

		button_1 = new JButton("1");
		button_1.setFont(font);
		button_1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		button_1.setBackground(SystemColor.window);
		button_1.setBounds(6, 150, 75, 40);
		this.add(button_1);

		// ------------------------------------------------------------------ Button 2

		button_2 = new JButton("2");
		button_2.setFont(font);
		button_2.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		button_2.setBackground(SystemColor.window);
		button_2.setBounds(81, 150, 75, 40);
		this.add(button_2);

		// ------------------------------------------------------------------ Button 3

		button_3 = new JButton("3");
		button_3.setFont(font);
		button_3.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		button_3.setBackground(SystemColor.window);
		button_3.setBounds(156, 150, 75, 40);
		this.add(button_3);

		// ------------------------------------------------------------------ Button 4

		button_4 = new JButton("4");
		button_4.setFont(font);
		button_4.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		button_4.setBackground(SystemColor.window);
		button_4.setBounds(6, 110, 75, 40);
		this.add(button_4);

		// ------------------------------------------------------------------ Button 5

		button_5 = new JButton("5");
		button_5.setFont(font);
		button_5.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		button_5.setBackground(SystemColor.window);
		button_5.setBounds(81, 110, 75, 40);
		this.add(button_5);

		// ------------------------------------------------------------------ Button 6

		button_6 = new JButton("6");
		button_6.setFont(font);
		button_6.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		button_6.setBackground(SystemColor.window);
		button_6.setBounds(156, 110, 75, 40);
		this.add(button_6);

		// ------------------------------------------------------------------ Button 7

		button_7 = new JButton("7");
		button_7.setFont(font);
		button_7.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		button_7.setBackground(SystemColor.window);
		button_7.setBounds(6, 70, 75, 40);
		this.add(button_7);

		// ------------------------------------------------------------------ Button 8

		button_8 = new JButton("8");
		button_8.setFont(font);
		button_8.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		button_8.setBackground(SystemColor.window);
		button_8.setBounds(81, 70, 75, 40);
		this.add(button_8);

		// ------------------------------------------------------------------ Button 9

		button_9 = new JButton("9");
		button_9.setFont(font);
		button_9.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		button_9.setBackground(SystemColor.window);
		button_9.setBounds(156, 70, 75, 40);
		this.add(button_9);

		// ------------------------------------------------------------------ Button
		// Plus

		button_plus = new JButton("+");
		button_plus.setFont(font);
		button_plus.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		button_plus.setBackground(SystemColor.window);
		button_plus.setBounds(235, 70, 59, 40);
		this.add(button_plus);

		// ------------------------------------------------------------------ Button
		// Minus

		button_minus = new JButton("-");
		button_minus.setFont(font);
		button_minus.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		button_minus.setBackground(SystemColor.window);
		button_minus.setBounds(235, 110, 59, 40);
		this.add(button_minus);

		// ------------------------------------------------------------------ Button Mal

		button_mal = new JButton("*");
		button_mal.setFont(font);
		button_mal.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		button_mal.setBackground(SystemColor.window);
		button_mal.setBounds(235, 150, 59, 40);
		this.add(button_mal);

		// ------------------------------------------------------------------ Button
		// Durch

		button_durch = new JButton("/");
		button_durch.setFont(font);
		button_durch.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		button_durch.setBackground(SystemColor.window);
		button_durch.setBounds(235, 190, 59, 40);
		this.add(button_durch);

		// ------------------------------------------------------------------ Button
		// Gleich

		button_gleich = new JButton("=");
		button_gleich.setFont(font);
		button_gleich.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		button_gleich.setBackground(SystemColor.window);
		button_gleich.setBounds(235, 229, 59, 40);
		this.add(button_gleich);

		// ------------------------------------------------------------------ Button
		// Clear

		button_clear = new JButton("Clear");
		button_clear.setFont(font);
		button_clear.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		button_clear.setBackground(SystemColor.window);
		button_clear.setBounds(6, 229, 75, 40);
		this.add(button_clear);

		// ------------------------------------------------------------------ Button
		// Punkt

		button_dot = new JButton(".");
		button_dot.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		button_dot.setFont(font);
		button_dot.setBackground(SystemColor.window);
		button_dot.setBounds(156, 229, 75, 40);
		this.add(button_dot);

		// ------------------------------------------------------------------ Button
		// Back

		button_back = new JButton("<-");
		button_back.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		button_back.setFont(font);
		button_back.setBackground(SystemColor.window);
		button_back.setBounds(81, 229, 75, 40);
		this.add(button_back);

	}
	
	public JTextField getCalculatorTextField() {
		return calculatorTextField;
	}

	public JButton getButton_0() {
		return button_0;
	}

	public JButton getButton_1() {
		return button_1;
	}

	public JButton getButton_2() {
		return button_2;
	}

	public JButton getButton_3() {
		return button_3;
	}

	public JButton getButton_4() {
		return button_4;
	}

	public JButton getButton_5() {
		return button_5;
	}

	public JButton getButton_6() {
		return button_6;
	}

	public JButton getButton_7() {
		return button_7;
	}

	public JButton getButton_8() {
		return button_8;
	}

	public JButton getButton_9() {
		return button_9;
	}

	public JButton getButton_plus() {
		return button_plus;
	}

	public JButton getButton_minus() {
		return button_minus;
	}

	public JButton getButton_mal() {
		return button_mal;
	}

	public JButton getButton_durch() {
		return button_durch;
	}

	public JButton getButton_gleich() {
		return button_gleich;
	}

	public JButton getButton_dot() {
		return button_dot;
	}

	public JButton getButton_clear() {
		return button_clear;
	}

	public JButton getButton_back() {
		return button_back;
	}

	@Override
	public JLabel getLabel() {
		JLabel label = new JLabel("Taschenrechner");
		label.setBounds(20, 5, 106, 16);
		return label;
	}
}
