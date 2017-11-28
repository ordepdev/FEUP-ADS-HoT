package hot;

import hot.Device;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

public abstract class BaseDevice implements Device, RenderedDevice {

  private boolean on = false;

  public void turnOn() {
    on = true;
  }

  public void turnOff() {
    on = false;
  }

  public boolean isOn() {
    return on;
  }

	public JPanel getPanel() {
		JPanel panel = new JPanel();
		panel.setLayout(new BorderLayout());
		JButton button = new JButton("OFF");
		button.setMargin(new Insets(20, 20, 20, 20));
		button.setOpaque(true);
		button.setContentAreaFilled(true);
		button.setBorderPainted(false);
		button.setFocusPainted(false);
		button.setBackground(Color.RED);
		button.setForeground(Color.BLACK);
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (isOn()) {
					button.setText("OFF");
					button.setBackground(Color.RED);
					turnOff();
				} else {
					button.setText("ON");
					button.setBackground(Color.GREEN);
					turnOn();
				}
			}
		});

		panel.add(button,BorderLayout.CENTER);
		return panel;		
	}
}
