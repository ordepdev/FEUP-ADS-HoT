package hot.state;

import java.awt.Color;
import java.io.Serializable;

public class On implements State, Serializable {

  @Override
  public State next() {
    return new Off();
  }

  @Override
  public boolean isOn() {
    return true;
  }

  @Override
  public String text() {
    return "ON";
  }

  @Override
  public Color color() {
    return Color.GREEN;
  }
}
