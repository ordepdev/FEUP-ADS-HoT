package hot.devices;

import hot.Device;
import hot.builders.ButtonBuilder;
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
    return new ButtonBuilder()
      .withMargin(20)
      .opaque()
      .filled()
      .withForeground(Color.BLACK)
      .withBackground(Color.RED)
      .withDevice(device)
      .build();
  }
}
