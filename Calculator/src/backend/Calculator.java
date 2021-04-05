package backend;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;

import frontend.CalculatorPanel;

public class Calculator {
	double num;
	Operations operation;
	public Calculator(CalculatorPanel panel, Log log) {
		
	JTextField textField = panel.getCalculatorTextField(); 
		
		panel.getButton_0().addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + "0");
			}
			});
			
			
			panel.getButton_1().addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					textField.setText(textField.getText() + "1");
				}
			});
			
			
			panel.getButton_2().addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					textField.setText(textField.getText() + "2");
				}
			});

			
			panel.getButton_3().addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					textField.setText(textField.getText() + "3");
				}
			});
			
			
			panel.getButton_4().addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					textField.setText(textField.getText() + "4");
				}
			});
			
			
			panel.getButton_5().addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					textField.setText(textField.getText() + "5");
				}
			});
		
			
			panel.getButton_6().addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					textField.setText(textField.getText() + "6");
				}
			});


			panel.getButton_7().addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					textField.setText(textField.getText() + "7");
				}
			});
			

			panel.getButton_8().addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					textField.setText(textField.getText() + "8");
				}
			});
			
			
			panel.getButton_9().addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					textField.setText(textField.getText() + "9");
				}
			});
			

			panel.getButton_dot().addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					if(textField.getText().contains(".")) {
						return;
					}
					textField.setText(textField.getText() + ".");
				}
			});

			
			panel.getButton_plus().addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					num = Double.parseDouble(textField.getText());
					operation = Operations.PLUS;
					textField.setText(" ");

				}
			});	
			
			
			panel.getButton_minus().addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					num = Double.parseDouble(textField.getText());
					operation = Operations.MINUS;
					textField.setText(" ");
				}
			});
			
			
			panel.getButton_mal().addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					num = Double.parseDouble(textField.getText());
					operation = Operations.MAL;
					textField.setText(" ");
				}
			});
			

			panel.getButton_durch().addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					num = Double.parseDouble(textField.getText());
					operation = Operations.DURCH;
					textField.setText(" ");
				}
			});
			

			panel.getButton_gleich().addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					textField.setText(Double.toString(operation.calculate(num, Double.parseDouble(textField.getText()))));
					}
			});
			

			panel.getButton_clear().addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					textField.setText(" ");
				}
			});
			
			
			panel.getButton_back().addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					int length = textField.getText().length();
					int number = textField.getText().length() - 1;
					String store;
					
					if (length > 0) {
						StringBuilder back = new StringBuilder(textField.getText());
						back.deleteCharAt(number);
						store = back.toString();
						textField.setText(store);
					}
				}
			});
	}
}
