package hot.state;

import java.awt.Color;

public interface State {
  State next();
  boolean isOn();
  String text();
  Color color();
}
