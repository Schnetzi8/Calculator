package backend;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.event.*;
import frontend.VolumePanel;
import javax.swing.JTextField;


/**
 * The {@link Volume} class handles calculation of the Volume
 * @author Oliver
 *
 */

public class Volume {

	/**
	 * @author Oliver
	 */
	public Volume(VolumePanel panel) {
		JTextField textField = panel.getVolumeTextField();
		
		panel.getBreite().addChangeListener(new ChangeListener() {

			@Override
			public void stateChanged(ChangeEvent e) {
				int hoehe = panel.getHoehe().getValue();
				int breite = panel.getBreite().getValue();
				int tiefe =  panel.getTiefe().getValue();
				textField.setText(Integer.toString(hoehe * breite * tiefe));
				
			}
		});
		panel.getHoehe().addChangeListener(new ChangeListener() {

			@Override
			public void stateChanged(ChangeEvent e) {				
				int hoehe = panel.getHoehe().getValue();
				int breite = panel.getBreite().getValue();
				int tiefe =  panel.getTiefe().getValue();
				textField.setText(Integer.toString(hoehe * breite * tiefe));
				
			}
		});
		panel.getTiefe().addChangeListener(new ChangeListener() {

			@Override
			public void stateChanged(ChangeEvent e) {
				int hoehe = panel.getHoehe().getValue();
				int breite = panel.getBreite().getValue();
				int tiefe =  panel.getTiefe().getValue();
				textField.setText(Integer.toString(hoehe * breite * tiefe));
				
			}
		});
		panel.getLeeren().addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				textField.setText("");
				panel.getTiefe().setValue(0);
				panel.getBreite().setValue(0);
				panel.getHoehe().setValue(0);
			}
		});
	
	}

}
