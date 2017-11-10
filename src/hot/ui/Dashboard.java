package hot.ui;

import java.awt.Component;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.JPanel;

import hot.devices.Device;

public class Dashboard {

	JPanel panel;
	
	public Component getPanel() {
		
		if (panel == null) {
			panel = new JPanel();
		}
		GridBagLayout gbl = new GridBagLayout();
		panel.setLayout(gbl);
		return panel;
	}

	public void add(Device device, int x, int y, int width, int height) {
		GridBagConstraints c = new GridBagConstraints();
		c.gridx = x;
	    c.gridy = y;
	    c.gridwidth = width;
	    c.gridheight = height;
	    c.fill = GridBagConstraints.BOTH;
		panel.add(device.getPanel(),c);
	}
}
