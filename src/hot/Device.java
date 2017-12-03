package hot;

import hot.ui.Notifier;

import java.io.Serializable;

public interface Device extends Notifier, Serializable {
  void turnOn();
  void turnOff();
  boolean isOn();
  Device clone();
}
