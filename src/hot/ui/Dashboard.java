package hot.ui;

import hot.Device;
import hot.devices.SwingDevice;

import java.awt.Component;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.JPanel;

public class Dashboard {

	private JPanel panel;
	
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
		panel.add(new SwingDevice(device).panel(),c);
	}
}
