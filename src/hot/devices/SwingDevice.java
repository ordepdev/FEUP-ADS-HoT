package hot.devices;

import hot.BaseDevice;
import hot.Device;

import javax.swing.JButton;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Insets;

public class SwingDevice extends BaseDevice {

  private Device device;

  public SwingDevice(Device device) {
    this.device = device;
  }

  public JPanel panel() {
    JPanel panel = new JPanel();
    panel.setLayout(new BorderLayout());
    JButton button = new JButton("OFF");
    button.setMargin(new Insets(20, 20, 20, 20));
    button.setOpaque(true);
    button.setContentAreaFilled(true);
    button.setBorderPainted(false);
    button.setFocusPainted(false);
    button.setForeground(Color.BLACK);
    button.setBackground(Color.RED);
    button.addActionListener(e -> {
      if (device.isOn()) {
        button.setText("OFF");
        button.setBackground(Color.RED);
        turnOff();
      } else {
        button.setText("ON");
        button.setBackground(Color.GREEN);
        turnOn();
      }
    });

    panel.add(button,BorderLayout.CENTER);
    return panel;
  }
}
