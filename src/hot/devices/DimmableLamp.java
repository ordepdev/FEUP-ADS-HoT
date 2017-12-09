package hot.devices;

import hot.Device;

public class DimmableLamp extends LampDecorator implements DimmableDevice {

  private Device device;

  private int intensity = 0;

  public DimmableLamp(Device device) {
    this.device = device;
  }

  @Override
  public void turnOn() {
    super.turnOn();
    this.device.turnOn();
  }

  @Override
  public void turnOff() {
    super.turnOff();
    this.device.turnOff();
  }

  @Override
  public boolean isOn() {
    return super.isOn();
  }

  @Override
  public void dimmTo(int intensity) {
    this.intensity = intensity;
  }

  @Override
  public int getIntensity() {
    return intensity;
  }
}
