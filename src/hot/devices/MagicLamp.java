package hot.devices;

import hot.BaseDevice;
import hot.Device;

public class MagicLamp extends BaseDevice {

  private Device device;

  public MagicLamp(Device device) {
    this.device = device;
  }

  @Override
  public void turnOn() {
    this.device.turnOn();
  }

  @Override
  public void turnOff() {
    this.device.turnOff();
  }

  @Override
  public boolean isOn() {
    return this.device.isOn();
  }
}
