package hot.devices;

import java.awt.Color;

public enum Status {
  ON(Color.GREEN), OFF(Color.RED);

  private final Color color;

  Status(Color color) {
    this.color = color;
  }

  public Color color() {
    return this.color;
  }
}
