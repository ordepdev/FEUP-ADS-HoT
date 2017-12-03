package hot;

public abstract class BaseDevice implements Device {

  private boolean on = false;

  public void turnOn() {
    on = true;
  }

  public void turnOff() {
    on = false;
  }

  public boolean isOn() {
    return on;
  }

  @Override
  public Device clone() {
    try {
      return (Device) super.clone();
    } catch (CloneNotSupportedException e) {
      throw new RuntimeException();
    }
  }
}
