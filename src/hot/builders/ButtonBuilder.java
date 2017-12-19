package hot.builders;

import hot.Device;
import hot.ui.ObservableButton;

import javax.swing.JButton;
import java.awt.Color;
import java.awt.Insets;

public class ButtonBuilder {

  private Insets margin;
  private boolean opaque;
  private boolean filled;
  private Color foreground;
  private Color background;
  private Device device;

  public ButtonBuilder withMargin(int value) {
    this.margin = new Insets(value, value, value, value);
    return this;
  }

  public ButtonBuilder opaque() {
    this.opaque = true;
    return this;
  }

  public ButtonBuilder filled() {
    this.filled = true;
    return this;
  }

  public ButtonBuilder withForeground(Color color) {
    this.foreground = color;
    return this;
  }

  public ButtonBuilder withBackground(Color color) {
    this.background = color;
    return this;
  }

  public ButtonBuilder withDevice(Device device) {
    this.device = device;
    return this;
  }

  public JButton build() {
    JButton button = new JButton("OFF");
    button.setMargin(this.margin);
    button.setOpaque(this.opaque);
    button.setContentAreaFilled(this.filled);
    button.setBorderPainted(false);
    button.setFocusPainted(false);
    button.setForeground(this.foreground);
    button.setBackground(this.background);
    button.addActionListener(e -> {
      if (device.isOn()) {
        device.turnOff();
      } else {
        device.turnOn();
      }
    });
    this.device.register(new ObservableButton(this.device, button));
    return button;
  }
}
