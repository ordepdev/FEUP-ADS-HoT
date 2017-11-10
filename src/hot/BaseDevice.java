package hot;

public abstract class BaseDevice implements Device {

  protected boolean on = false;

  public void turnOn() {
    on = true;
  }

  public void turnOff() {
    on = false;
  }

  public boolean isOn() {
    return on;
  }
}
