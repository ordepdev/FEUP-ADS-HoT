package hot;

import hot.state.State;
import hot.ui.Notifier;

import java.io.Serializable;

public interface Device extends Notifier, Serializable {
  void turnOn();
  void turnOff();
  boolean isOn();
  State state();
  Device clone();
}
