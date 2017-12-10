package hot.devices;

import hot.Device;
import hot.ui.ObservableButton;

import javax.swing.JButton;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Insets;

public class SwingDevice extends LampDecorator {

  private Device device;

  public SwingDevice(Device device) {
    this.device = device;
  }

  @Override
  public void turnOn() {
    this.device.turnOn();
  }

  @Override
  public void turnOff() {
    this.device.turnOff();
  }

  @Override
  public boolean isOn() {
    return this.device.isOn();
  }

  public JPanel panel() {
    JPanel panel = new JPanel();
    panel.setLayout(new BorderLayout());
    panel.add(button(), BorderLayout.CENTER);
    return panel;
  }

  private JButton button() {
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
        turnOff();
      } else {
        turnOn();
      }
    });
    this.device.register(new ObservableButton(this.device, button));
    return button;
  }
}
