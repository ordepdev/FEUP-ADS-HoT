package hot.state;

import java.awt.Color;
import java.io.Serializable;

public class Off implements State, Serializable {

  @Override
  public State next() {
    return new On();
  }

  @Override
  public boolean isOn() {
    return false;
  }

  @Override
  public String text() {
    return "OFF";
  }

  @Override
  public Color color() {
    return Color.RED;
  }
}
